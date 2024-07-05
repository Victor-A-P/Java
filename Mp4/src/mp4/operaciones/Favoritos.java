package mp4.operaciones;

import mp4.modelos.Audio;

public class Favoritos {
    public void adiccionar(Audio audio)
    {
        if (audio.getClasificacion() >= 8)
        {
            System.out.println(audio.getTitulo() + " Es de los favoritos en estos momentos");
        }else {
            System.out.println(audio.getTitulo() + " Fue escuchado por otros usuarios");
        }
    }
}
