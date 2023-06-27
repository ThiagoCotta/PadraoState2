public class ArquivoFormatoPdf extends ArquivoFormato {

    private ArquivoFormatoPdf() {};
    private static ArquivoFormatoPdf instance = new ArquivoFormatoPdf();
    public static ArquivoFormatoPdf getInstance() {
        return instance;
    }
    
    public String getFormato() {
        return "Pdf";
    }


    public boolean transformarBase64(Arquivo arquivo) {
        arquivo.setFormato(ArquivoFormatoBase64.getInstance());
        return true;
    }
    public boolean transformarJpg(Arquivo arquivo) {
        arquivo.setFormato(ArquivoFormatoJpg.getInstance());
        return true;
    }
    public boolean transformarPng(Arquivo arquivo) {
        arquivo.setFormato(ArquivoFormatoPng.getInstance());
        return true;
    }
}

