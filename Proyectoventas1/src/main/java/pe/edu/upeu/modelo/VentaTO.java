package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaTO {
    public String idVenta,idDni, fechaVenta;
    public Double netoTotal, igv, precioTotal;
}
