public class Arquivo {
    
    private String nome;
    private ArquivoFormato formato;

    public Arquivo() {
        this.formato = ArquivoFormatoBase64.getInstance();
    }
    
    public void setFormato(ArquivoFormato formato) {
        this.formato = formato;
    }
    
    public boolean transformarBase64() {
        return formato.transformarBase64(this);
    }
    
    public boolean transformarJpg() {
        return formato.transformarJpg(this);
    }
    
    public boolean transformarPdf() {
        return formato.transformarPdf(this);
    }
    
    public boolean transformarPng() {
        return formato.transformarPng(this);
    }

    public String getNomeFormato() {
        return formato.getFormato();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArquivoFormato getFormato() {
        return formato;
    }    
}
