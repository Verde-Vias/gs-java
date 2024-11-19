package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.RegioesSustentaveis;
import br.com.fiap.conexoes.ConexaoFactory;

public class RegioesSustentaveisDAO {

	public Connection minhaConexao;

	public RegioesSustentaveisDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().Conexao();
	}

	// insert
	public String inserir(RegioesSustentaveis regioesSustentaveis) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement("Insert into Regioes_Sustentaveis values (?, ?)");

		stmt.setInt(1, regioesSustentaveis.getIdRegiao());
		stmt.setString(2, regioesSustentaveis.getNome());
		

		return "Regiao Sustentavel cadastrada com sucesso";
	}

	// Delete
	public String deletar(int idRegiao) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from Regioes_Sustentaveis where id_regiao = ?");
		stmt.setInt(1, idRegiao);
		stmt.execute();
		stmt.close();
		return "Deletado com Sucesso!";
	}

	// UpDate
	public String atualizar(RegioesSustentaveis regioesSustentaveis) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement(" Update Regioes_Sustentaveis set NOME = ? where id_regiao = ?");
		stmt.setString(1, regioesSustentaveis.getNome());
		stmt.setInt(2, regioesSustentaveis.getIdRegiao());
		stmt.executeUpdate();
		stmt.close();
		return "Atualizado com Sucesso!";
	}

	// Select
	public List<RegioesSustentaveis> selecionar() throws SQLException {
		List<RegioesSustentaveis> listaRegioesSustentaveis = new ArrayList<RegioesSustentaveis>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM Regioes_Sustentaveis");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			RegioesSustentaveis regioesSustentaveis = new RegioesSustentaveis();
			regioesSustentaveis.setIdRegiao(rs.getInt(1));
			regioesSustentaveis.setNome(rs.getString(2));
			listaRegioesSustentaveis.add(regioesSustentaveis);
		}
		return listaRegioesSustentaveis;
	}

}
