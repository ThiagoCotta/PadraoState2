public class ArquivoFormatoJpg extends ArquivoFormato {

    private ArquivoFormatoJpg() {};
    private static ArquivoFormatoJpg instance = new ArquivoFormatoJpg();
    public static ArquivoFormatoJpg getInstance() {
        return instance;
    }

    public String getFormato() {
        return "Jpg";
    }

    public boolean transformarBase64(Arquivo arquivo) {
        arquivo.setFormato(ArquivoFormatoBase64.getInstance());
        return true;
    }
    public boolean transformarPdf(Arquivo arquivo) {
        arquivo.setFormato(ArquivoFormatoPdf.getInstance());
        return true;
    }
    public boolean transformarPng(Arquivo arquivo) {
        arquivo.setFormato(ArquivoFormatoPng.getInstance());
        return true;
    }
}
