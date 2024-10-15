package com.upgrade.purchase_manager_api.domain.usecase.validators;

import java.util.Arrays;
import java.util.List;

public class PurchaseOrderLoaderFileValidator {

    public enum RequiredExcelColumn {
        PICKUP_CITY("Ciudad origen"),
        PICKUP_LOCATION("Pickup Location"),
        ORDER_DATE("Fecha Pedido"),
        SALE_DATE("Sale Date"),
        DISPATCH_DATE("Fecha despacho"),
        DISPATCH_DAY("Dispatch Day"),
        DELIVERY_DATE("Fecha de entrega"),
        DESTINATION_CITY("Ciudad destino"),
        DELIVERY_ADDRESS("Dirección*"),
        DECLARED_VALUE("Valor declarado"),
        ITEM_SKU("Código del artículo SKU"),
        ITEM_DESCRIPTION("Descripción del artículo"),
        QUANTITY("Cantidad despacho"),
        WEIGHT("Peso"),
        HEIGHT("Alto"),
        WIDTH("Ancho"),
        LENGTH("Largo"),
        VOLUME("Volumen m3");

        private final String columnName;

        RequiredExcelColumn(String columnName) {
            this.columnName = columnName;
        }

        public String getColumnName() {
            return columnName;
        }

        public List<RequiredExcelColumn> get() {
            return Arrays.stream(RequiredExcelColumn.values()).toList();
        }
    }
}
