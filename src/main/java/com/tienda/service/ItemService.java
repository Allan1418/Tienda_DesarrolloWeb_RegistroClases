
package com.tienda.service;

import com.tienda.domain.Item;
import java.util.ArrayList;
import java.util.List;


public interface ItemService{

    List<Item> listaItems = new ArrayList<>();
    
    public List<Item> gets();
    
    //se recupera el registro que tiene el idItem pasado por param
    public Item get(Item item);
    
    //se guarda el registro que tiene el IdItem pasado por param
    public void save(Item item);
    
    // se elimina el registro que tiene el IdItem pasado por param
    public void delete(Item item);
    
    public void actualiza(Item item);
    
    public void facturar();
    
}
