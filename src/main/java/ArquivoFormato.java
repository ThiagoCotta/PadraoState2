public abstract class ArquivoFormato {
    
    public abstract String getFormato();

    public boolean transformarBase64(Arquivo arquivo) {
        return false;
    }

    public boolean transformarJpg(Arquivo arquivo) {
        return false;
    }

    public boolean transformarPdf(Arquivo arquivo) {
        return false;
    }

    public boolean transformarPng(Arquivo arquivo) {
        return false;
    }
    
}
