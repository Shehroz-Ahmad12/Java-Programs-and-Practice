import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
 
public class PlannerMini {
   public static final String NAME = "Name";
   public static final String DESCRIPTION = "Description";
   public static final String IMPORTANCE = "Important";
   public static final String URGENCY = "Urgent";
   public static final String PRIORITY = "Priority";
   public static final String DUE_DATE = "Due Date";
   public static final String DUE_TIME = "Due Time";
   public static final String[] COLUMN_NAMES = {
      NAME, DESCRIPTION, IMPORTANCE, URGENCY, PRIORITY, DUE_DATE, DUE_TIME
   };
   private static final int[] PREF_COL_WIDTHS = {
      200, 400, 70, 70, 70, 100, 100
   };
   private static final String FILE_PATH = "Priorities.ser";
    
   private JPanel mainPanel = new JPanel();
   private ActivityTableModel model = new ActivityTableModel(COLUMN_NAMES);
   private JTable activityTable = new JTable(model);
    
   public PlannerMini() {
      activityTable.setFillsViewportHeight(true);
      //activityTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
      TableColumnModel tcModel = activityTable.getColumnModel();
      int totalWidth = 0;
      for (int i = 0; i < COLUMN_NAMES.length; i++) {
         tcModel.getColumn(i).setPreferredWidth(PREF_COL_WIDTHS[i]);
         totalWidth += PREF_COL_WIDTHS[i];
      }
      activityTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
      activityTable.getColumn(DUE_TIME).setCellRenderer(new TimeCellRenderer());
       
      JScrollPane scrollpane = new JScrollPane(activityTable);
 
      Dimension spSize = scrollpane.getPreferredSize();
      scrollpane.setPreferredSize(new Dimension(totalWidth, spSize.height));
 
      mainPanel.setLayout(new GridLayout(1,0));
      mainPanel.add(scrollpane);
       
      addDataToModel(model);
       
   }
 
   private void addDataToModel(ActivityTableModel atModel) {
      ObjectInputStream ois = null;
      try {
         FileInputStream fis = new FileInputStream(FILE_PATH);
         ois = new ObjectInputStream(fis);
         while (true) {
            Activity activity = (Activity)ois.readObject();
            atModel.addRow(activity);
         }
      }
      catch (FileNotFoundException e) {
         e.printStackTrace();
      }
      catch (EOFException eof) {
         // ignore this one as it is how 
         // ObjectInputStream detects end of file
      }
      catch (IOException e) {
         e.printStackTrace();
      }
      catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
      finally {
         if (ois != null) {
            try {
               ois.close();
            }
            catch (IOException e) {
               e.printStackTrace();
            }
         }
      }
   }
 
   public JComponent getComponent() {
      return mainPanel;
   }
 
   private static void createAndShowUI() {
      JFrame frame = new JFrame("Mini Planner");
      frame.getContentPane().add(new PlannerMini().getComponent());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
 
   public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            createAndShowUI();
         }
      });
   }
}
 
@SuppressWarnings("serial")
class ActivityTableModel extends DefaultTableModel {
 
   public ActivityTableModel(String[] columnNames) {
      super(columnNames, 0);
   }
 
   @Override
   public Class<?> getColumnClass(int columnIndex) {
      switch (columnIndex) {
         case 2:
            return Boolean.class;
         case 3:
            return Boolean.class;
         case 4:
            return Integer.class;
         case 5:
            return Date.class;
         case 6:
            return Date.class;
 
         default:
            return super.getColumnClass(columnIndex);
      }
   }
    
   public void addRow(Activity activity) {
      Object[] rowData = new Object[getColumnCount()];
      rowData[0] = activity.getActivityName();
      rowData[1] = activity.getActivityDescription();
      rowData[2] = activity.getActivityImportance();
      rowData[3] = activity.getActivityUrgency();
      rowData[4] = activity.getPriorityCode();
      rowData[5] = activity.getActivityDueDate().getTime();
      rowData[6] = activity.getActivityDueDate().getTime();
      super.addRow(rowData);
   }
}
 
@SuppressWarnings("serial")
class TimeCellRenderer extends DefaultTableCellRenderer {
   private SimpleDateFormat formatter;
    
   @Override
   protected void setValue(Object value) {
       
      if (formatter == null) {
         formatter = new SimpleDateFormat("hh:mm a");
      }
      setText((value == null) ? "" : formatter.format(value));
   }
}