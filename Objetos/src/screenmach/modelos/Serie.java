package screenmach.modelos;

public class Serie  extends Titulo{
    int temporada;
    int episodiosPorTemporada;
    int minutosPorEpisodios;

    @Override
    // Las anotaciones se identifican por el uso de '@'
    //@Deprecated indica que el metodo o clase esta obsoleto y no debe de usarse
    //'Override es un warning que indica que el metodo ya existe y que se esta sobrescibiendo'
    // Es posible crear tus propias anotaciones @ejemplo
    // public @interface ejemplo{} -> es necesario @retention y @target
    public int getDuracionEnMinutos() {
        return temporada * episodiosPorTemporada *minutosPorEpisodios;
        // super indica que regresa un metodo de la clase madre o super clase
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }


}
