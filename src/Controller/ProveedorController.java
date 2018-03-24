package Controller;

import Model.Proveedor;
import java.util.ArrayList;

public class ProveedorController {

    ArrayList<Proveedor> lista_proovedor = new ArrayList();
    
    public void Create(Proveedor Model) {
        lista_proovedor.add(Model);
    }
    
    public ArrayList<Proveedor> Read(String Filter) {
        ArrayList<Proveedor> Get = new ArrayList<>();
        for(Proveedor Pro : getLista_proovedor()){
            if(Pro.getNombre().contains(Filter)){
                Get.add(Pro);
            }
        }
        return Get;
    }
   
    public void Delete(int Index) {
        lista_proovedor.remove(Index);
    }
    
    public void Update(int Index, Proveedor Model) {
       lista_proovedor.set(Index, Model);
    }

    public ArrayList<Proveedor> getLista_proovedor() {
        return lista_proovedor;
    }

    public void setLista_proovedor(ArrayList<Proveedor> lista_proovedor) {
        this.lista_proovedor = lista_proovedor;
    }
}
