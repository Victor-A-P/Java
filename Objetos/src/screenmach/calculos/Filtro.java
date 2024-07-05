package screenmach.calculos;


import screenmach.modelos.Titulo;

public class Filtro{



    public String filtrar(Clasificacion clasificacion)
    {
        if(clasificacion.getClasificacion() >= 4)
        {
           return "Es muy probable que te guste ";
        } else if (clasificacion.getClasificacion() >=2)
                {
                    return "Popular por el momento ";
                }else{
                        return "Por si quieres explorar algo nuevo ";
                     }
    }
}
