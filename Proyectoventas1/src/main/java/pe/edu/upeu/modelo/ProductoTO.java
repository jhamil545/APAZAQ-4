package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ProductoTO {
   public String idProducto, nombre, unidadMed, idCateg;
   public double preUnitario, porcentUtil, stock;
}
