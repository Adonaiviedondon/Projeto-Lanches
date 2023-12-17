package testes;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Telas.TelaLogin;

import javax.swing.JPasswordField;

public class TelaLoginTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testLogarComUsuarioESenhaValidos() {
        TelaLogin telaLogin = new TelaLogin();

        // Substitui a conexão por uma implementação "falsa"
        telaLogin.conexao = new FakeConnection();

        JTextField textUsuario = new JTextField("usuarioteste");
        JPasswordField passwordUsuario = new JPasswordField("senhateste");

        telaLogin.textUsuario = textUsuario;
        telaLogin.passwordUsuario = passwordUsuario;

        JButton BtLogin = new JButton();
        BtLogin.addActionListener(e -> telaLogin.logar());

        BtLogin.doClick();

        assertNotNull(telaLogin.getContentPane().getComponent(0)); // Altere conforme necessário

        // Restaura a conexão para null para evitar interferência com outros testes
        telaLogin.conexao = null;
    }

    @Test
    void testLogarComUsuarioOuSenhaInvalidos() {
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.conexao = new FakeConnection();

        JTextField textUsuario = new JTextField("usuarioteste");
        JPasswordField passwordUsuario = new JPasswordField("senhainvalida");

        telaLogin.textUsuario = textUsuario;
        telaLogin.passwordUsuario = passwordUsuario;

        JButton BtLogin = new JButton();
        BtLogin.addActionListener(e -> telaLogin.logar());

        // Redireciona a saída padrão para capturar mensagens de erro
        System.setOut(new PrintStream(outContent));

        BtLogin.doClick();

        assertNull(telaLogin.getContentPane().getComponent(0)); // Altere conforme necessário

        // Verifica se a mensagem de erro esperada foi exibida
        assertTrue(outContent.toString().contains("Usuário ou senha inválido"));

        // Restaura a saída padrão
        System.setOut(originalOut);

        telaLogin.conexao = null;
    }

    private static class FakeConnection implements Connection {
        // Implementa métodos necessários da interface Connection, mas pode ser vazia para este exemplo
    }
}
