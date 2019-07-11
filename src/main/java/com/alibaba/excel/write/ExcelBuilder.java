package com.alibaba.excel.write;

import java.util.List;

import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;

/**
 * @author jipengfei
 */
public interface ExcelBuilder {

    /**
     * WorkBook increase value
     *
     * @param data       java basic type or java model extend BaseModel
     * @param sheetParam Write the sheet
     */
    void addContent(List data, Sheet sheetParam);

    /**
     * WorkBook increase value
     *
     * @param data       java basic type or java model extend BaseModel
     * @param sheetParam Write the sheet
     * @param table      Write the table
     */
    void addContent(List data, Sheet sheetParam, Table table);

    /**
     * Creates new cell range. Indexes are zero-based.
     *
     * @param firstRow Index of first row
     * @param lastRow  Index of last row (inclusive), must be equal to or larger than {@code firstRow}
     * @param firstCol Index of first column
     * @param lastCol  Index of last column (inclusive), must be equal to or larger than {@code firstCol}
     */
    @Deprecated
    void merge(int firstRow, int lastRow, int firstCol, int lastCol);

    /**
     * Close io
     */
    void finish();
}
