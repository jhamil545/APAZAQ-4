package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaDetalleTO {
    public String idVentaDetalle, idVenta, idProducto;
    public double precioUnit, porcentUtil, cantidad, precioTotal;
    
}
