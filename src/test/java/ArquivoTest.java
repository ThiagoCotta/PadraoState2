import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArquivoTest {

    Arquivo arquivo;

    @BeforeEach
    public void setUp() {
        arquivo = new Arquivo();
    }

    // Arquivo Base64

    @Test
    public void naoDeveTransformarBase64() {
        arquivo.setFormato(ArquivoFormatoBase64.getInstance());
        assertFalse(arquivo.transformarBase64());
    }

    @Test
    public void deveTransformarBase64EmJpg() {
        arquivo.setFormato(ArquivoFormatoBase64.getInstance());
        assertTrue(arquivo.transformarJpg());
        assertEquals(ArquivoFormatoJpg.getInstance(), arquivo.getFormato());
    }

    @Test
    public void deveTransformarBase64EmPdf() {
        arquivo.setFormato(ArquivoFormatoBase64.getInstance());
        assertTrue(arquivo.transformarPdf());
        assertEquals(ArquivoFormatoPdf.getInstance(), arquivo.getFormato());
    }

    @Test
    public void deveTransformarBase64EmPng() {
        arquivo.setFormato(ArquivoFormatoBase64.getInstance());
        assertTrue(arquivo.transformarPng());
        assertEquals(ArquivoFormatoPng.getInstance(), arquivo.getFormato());
    }

    // Arquivo Jpg

    @Test
    public void naoDeveTransformarJpg() {
        arquivo.setFormato(ArquivoFormatoJpg.getInstance());
        assertFalse(arquivo.transformarJpg());
    }

    @Test
    public void deveTransformarJpgEmBase64() {
        arquivo.setFormato(ArquivoFormatoJpg.getInstance());
        assertTrue(arquivo.transformarBase64());
        assertEquals(ArquivoFormatoBase64.getInstance(), arquivo.getFormato());
    }

    @Test
    public void deveTransformarJpgEmPdf() {
        arquivo.setFormato(ArquivoFormatoJpg.getInstance());
        assertTrue(arquivo.transformarPdf());
        assertEquals(ArquivoFormatoPdf.getInstance(), arquivo.getFormato());
    }

    @Test
    public void deveTransformarJpgEmPng() {
        arquivo.setFormato(ArquivoFormatoJpg.getInstance());
        assertTrue(arquivo.transformarBase64());
        assertEquals(ArquivoFormatoBase64.getInstance(), arquivo.getFormato());
    }

    // Arquivo Pdf

    @Test
    public void naoDeveTransformarPdf() {
        arquivo.setFormato(ArquivoFormatoPdf.getInstance());
        assertFalse(arquivo.transformarPdf());
    }

    @Test
    public void deveTransformarPdfEmBase64() {
        arquivo.setFormato(ArquivoFormatoPdf.getInstance());
        assertTrue(arquivo.transformarBase64());
        assertEquals(ArquivoFormatoBase64.getInstance(), arquivo.getFormato());
    }

    @Test
    public void deveTransformarPdfEmJpg() {
        arquivo.setFormato(ArquivoFormatoPdf.getInstance());
        assertTrue(arquivo.transformarJpg());
        assertEquals(ArquivoFormatoJpg.getInstance(), arquivo.getFormato());
    }

    @Test
    public void deveTransformarPdfEmPng() {
        arquivo.setFormato(ArquivoFormatoPdf.getInstance());
        assertTrue(arquivo.transformarPng());
        assertEquals(ArquivoFormatoPng.getInstance(), arquivo.getFormato());
    }

    // Arquivo Png

    @Test
    public void naoDeveTransformarPng() {
        arquivo.setFormato(ArquivoFormatoPng.getInstance());
        assertFalse(arquivo.transformarPng());
    }

    @Test
    public void deveTransformarPngEmBase64() {
        arquivo.setFormato(ArquivoFormatoPng.getInstance());
        assertTrue(arquivo.transformarBase64());
        assertEquals(ArquivoFormatoBase64.getInstance(), arquivo.getFormato());
    }

    @Test
    public void deveTransformarPngEmJpg() {
        arquivo.setFormato(ArquivoFormatoPng.getInstance());
        assertTrue(arquivo.transformarJpg());
        assertEquals(ArquivoFormatoJpg.getInstance(), arquivo.getFormato());
    }

    @Test
    public void deveTransformarPngEmPdf() {
        arquivo.setFormato(ArquivoFormatoPng.getInstance());
        assertTrue(arquivo.transformarPdf());
        assertEquals(ArquivoFormatoPdf.getInstance(), arquivo.getFormato());
    }
}