# API E-commerce - TalentoTech Java 2025

API REST desarrollada en Java con Spring Boot y MySQL para gestionar un sistema de E-commerce.

## Objetivo

Desarrollar una API RESTful aplicando conceptos avanzados de programación en Java, arquitectura REST, bases de datos relacionales, validaciones, excepciones y organización modular.

## Tecnologías

- Java 17+
- Spring Boot 3.x
- MySQL
- Maven
- JPA/Hibernate

## Conceptos Aplicados

**Tipos de datos:** `int`, `double`, `String`, `boolean`

**Colecciones:** `ArrayList<Producto>`, `ArrayList<LineaPedido>`, `Map<Integer, Integer>`

**POO:** Clases `Producto`, `Pedido`, `ProductoService`, `PedidoService`

**Herencia:** Subclases `Bebida` y `Comida` que extienden `Producto`

**Excepciones personalizadas:** `StockInsuficienteException`, `ProductoNoEncontradoException`

**Organización:** Paquetes `productos`, `pedidos`, `excepciones`, `controladores`

## Instalación

1. Crear base de datos:
   ```sql
   CREATE DATABASE ecommerce_db;
   ```

2. Configurar credenciales en `application.properties`

3. Ejecutar:
   ```bash
   ./mvnw spring-boot:run
   ```

La API estará en `http://localhost:8080`

## Endpoints

**Productos:** GET, POST, PUT, DELETE en `/api/productos`

**Pedidos:** GET, POST, PUT, DELETE en `/api/pedidos`
