package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.EmissoesCarbono;
import br.com.fiap.conexoes.ConexaoFactory;

public class EmissoesCarbonoDAO {

	public Connection minhaConexao;

	public EmissoesCarbonoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().Conexao();
	}

	// insert
	public String inserir(EmissoesCarbono emissoesCarbono) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement("Insert into Emissoes_Carbono values (?, ?)");

		stmt.setInt(1, emissoesCarbono.getIdEmissao());
		stmt.setDouble(2, emissoesCarbono.getEmissao());
		

		return "Emissao cadastrada com sucesso";
	}

	// Delete
	public String deletar(int idEmissao) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from Emissoes_Carbono where id_emissao = ?");
		stmt.setInt(1, idEmissao);
		stmt.execute();
		stmt.close();
		return "Deletado com Sucesso!";
	}

	// UpDate
	public String atualizar(EmissoesCarbono emissoesCarbono) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement("Update Emissoes_Carbono set Emissao = ? where id_emissao = ?");
		stmt.setDouble(1, emissoesCarbono.getEmissao());
		stmt.setInt(2, emissoesCarbono.getIdEmissao());
		stmt.executeUpdate();
		stmt.close();
		return "Atualizado com Sucesso!";
	}

	// Select
	public List<EmissoesCarbono> selecionar() throws SQLException {
		List<EmissoesCarbono> listaEmissoesCarbono = new ArrayList<EmissoesCarbono>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM Emissoes_Carbono");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			EmissoesCarbono emissoesCarbono = new EmissoesCarbono();
			emissoesCarbono.setIdEmissao(rs.getInt(1));
			emissoesCarbono.setEmissao(rs.getDouble(2));
			listaEmissoesCarbono.add(emissoesCarbono);
		}
		return listaEmissoesCarbono;
	}

}
