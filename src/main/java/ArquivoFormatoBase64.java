public class ArquivoFormatoBase64 extends ArquivoFormato {

    private ArquivoFormatoBase64() {};
    private static ArquivoFormatoBase64 instance = new ArquivoFormatoBase64();
    public static ArquivoFormatoBase64 getInstance() {
        return instance;
    }

    public String getFormato() {
        return "Base64";
    }
    
    public boolean transformarJpg(Arquivo arquivo) {
        arquivo.setFormato(ArquivoFormatoJpg.getInstance());
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
