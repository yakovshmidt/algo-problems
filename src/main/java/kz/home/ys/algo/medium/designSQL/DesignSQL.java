package kz.home.ys.algo.medium.designSQL;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DesignSQL {

    private final Map<String, Integer> tableNameToIndiceMap = new HashMap<>();
    private final Map<String, Map<Integer, List<String>>> tableNameToIndicesToRowsMap = new HashMap<>();

    public DesignSQL(List<String> names, List<Integer> columns) {
        for (String name : names) {
            tableNameToIndicesToRowsMap.put(name, new HashMap<>());
            tableNameToIndiceMap.put(name, 1);
        }
    }
    
    public void insertRow(String name, List<String> row) {
        Map<Integer, List<String>> indicesToRows = tableNameToIndicesToRowsMap.get(name);
        int idx = tableNameToIndiceMap.get(name);
        indicesToRows.put(idx, row);
        tableNameToIndiceMap.put(name, idx + 1);
    }
    
    public void deleteRow(String name, int rowId) {
        tableNameToIndicesToRowsMap.get(name).remove(rowId);
    }
    
    public String selectCell(String name, int rowId, int columnId) {
        Map<Integer, List<String>> indicesToRows = tableNameToIndicesToRowsMap.get(name);
        return indicesToRows.get(rowId).get(columnId - 1);
    }
}

/**
 * Your SQL object will be instantiated and called as such:
 * SQL obj = new SQL(names, columns);
 * obj.insertRow(name,row);
 * obj.deleteRow(name,rowId);
 * String param_3 = obj.selectCell(name,rowId,columnId);
 */