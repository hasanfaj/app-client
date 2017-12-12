/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.model;

import entity.mahasiswa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author paguman
 */
public class tabelmodelmahasiswa extends AbstractTableModel {
    
    private List<mahasiswa> list = new ArrayList<mahasiswa>();
       
    public tabelmodelmahasiswa() {
        
    }
    
    public mahasiswa get(int row){
        return list.get(row);
    }
        
    public void insert(mahasiswa tblmahasiswa){
        list.add(tblmahasiswa);
        fireTableDataChanged();
    }
    
    public void update(int row, mahasiswa tblmahasiswa){
        list.set(row, tblmahasiswa);
    }
    
    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }
    
    public void setData(List<mahasiswa> list){
        this.list = list;
        fireTableDataChanged();
    }
    
    public String getColumnName(int column){
        switch(column){
//            case 0:return "id";
            case 0:return "nama";
            case 1:return "jeniskelamin";
            case 2:return "nim";
            case 3:return "uts";
            case 4:return "uas";
            case 5:return "tugas";
            case 6:return "average";
            default: return null;
        }         
              
    }
    
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 7;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
//            case 0:
//                return list.get( rowIndex).getId();
            case 0:
                return list.get(rowIndex).getNama();
            case 1:
                return list.get(rowIndex).getJeniskelamin();
            case 2:
                return list.get(rowIndex).getNim();
            case 3:
                return list.get(rowIndex).getUts();
            case 4:
                return list.get(rowIndex).getUas();
            case 5:
                return list.get(rowIndex).getTugas();
            case 6:
                return list.get(rowIndex).getAverage();
            default:
                return null;
        
    }
    
    }
}
