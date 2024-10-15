-- Crear el esquema purchase_orders
CREATE SCHEMA IF NOT EXISTS purchase_orders;

-- Crear la tabla orders
CREATE TABLE IF NOT EXISTS purchase_orders.orders (
  order_id BIGSERIAL PRIMARY KEY,  -- Identificador único del pedido
  pickup_city VARCHAR(100) NOT NULL,  -- Ciudad de origen
  pickup_location VARCHAR(255),  -- Lugar de recogida
  order_date DATE NOT NULL,  -- Fecha del pedido
  dispatch_date DATE NOT NULL,  -- Fecha de despacho
  delivery_date DATE NOT NULL,  -- Fecha de entrega
  external_order_identifier NUMERIC not null , --identificador externo del pedido
  destination_city VARCHAR(100) NOT NULL,  -- Ciudad destino
  delivery_address VARCHAR(255) NOT NULL,  -- Dirección de entrega
  declared_value NUMERIC(12, 2)  -- Valor declarado del pedido
);

-- Crear la tabla products
CREATE TABLE IF NOT EXISTS purchase_orders.products (
  item_id SERIAL PRIMARY KEY,  -- Identificador único del producto en el pedido
  order_id INT NOT NULL,  -- Relación con la tabla orders
  item_sku VARCHAR(50) NOT NULL,  -- Código SKU del producto
  item_description VARCHAR(255) NOT NULL,  -- Descripción del SKU
  quantity INT NOT NULL,  -- Cantidad de productos en el pedido
  weight NUMERIC(10, 2) NOT NULL,  -- Peso en kilogramos
  height NUMERIC(10, 2) NOT NULL,  -- Alto en cm
  width NUMERIC(10, 2) NOT NULL,  -- Ancho en cm
  length NUMERIC(10, 2) NOT NULL,  -- Largo en cm
  volume NUMERIC(10, 2) NOT NULL,  -- Volumen en m³,
CONSTRAINT fk_order
      FOREIGN KEY (order_id) REFERENCES purchase_orders.orders(order_id) ON DELETE CASCADE
);
