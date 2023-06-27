public class ArquivoFormatoPng extends ArquivoFormato {

    private ArquivoFormatoPng() {};
    private static ArquivoFormatoPng instance = new ArquivoFormatoPng();
    public static ArquivoFormatoPng getInstance() {
        return instance;
    }
    
    public String getFormato() {
        return "Png";
    }

    public boolean transformarBase64(Arquivo arquivo) {
        arquivo.setFormato(ArquivoFormatoBase64.getInstance());
        return true;
    }
    public boolean transformarJpg(Arquivo arquivo) {
        arquivo.setFormato(ArquivoFormatoJpg.getInstance());
        return true;
    }
    public boolean transformarPdf(Arquivo arquivo) {
        arquivo.setFormato(ArquivoFormatoPdf.getInstance());
        return true;
    }
}
