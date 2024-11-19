package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.ProjetosSustentaveis;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProjetosSustentaveisDAO {

	public Connection minhaConexao;

	public ProjetosSustentaveisDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().Conexao();
	}

	// insert
	public String inserir(ProjetosSustentaveis projetosSustentaveis) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement("Insert into Projetos_Sustentaveis values (?, ?, ?, ?)");

		stmt.setInt(1, projetosSustentaveis.getIdProjeto());
		stmt.setString(2, projetosSustentaveis.getDescricao());
		stmt.setDouble(3, projetosSustentaveis.getCusto());
		stmt.setString(4, projetosSustentaveis.getStatus());
		

		return "Projeto Sustentavel cadastrada com sucesso";
	}

	// Delete
	public String deletar(int idProjeto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from Projetos_Sustentaveis where id_projeto = ?");
		stmt.setInt(1, idProjeto);
		stmt.execute();
		stmt.close();
		return "Deletado com Sucesso!";
	}

	// UpDate
	public String atualizar(ProjetosSustentaveis projetosSustentaveis) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement(" Update Projetos_Sustentaveis set Descricao = ?, " 
						+ "Custo = ?, " + "Status = ? where id_projeto = ?");
		stmt.setString(1, projetosSustentaveis.getDescricao());
		stmt.setDouble(2, projetosSustentaveis.getCusto());
		stmt.setString(3, projetosSustentaveis.getStatus());
		stmt.setInt(4, projetosSustentaveis.getIdProjeto());
		stmt.executeUpdate();
		stmt.close();
		return "Atualizado com Sucesso!";
	}

	// Select
	public List<ProjetosSustentaveis> selecionar() throws SQLException {
		List<ProjetosSustentaveis> listaProjetosSustentaveis = new ArrayList<ProjetosSustentaveis>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM Projetos_Sustentaveis");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			ProjetosSustentaveis projetosSustentaveis = new ProjetosSustentaveis();
			projetosSustentaveis.setIdProjeto(rs.getInt(1));
			projetosSustentaveis.setDescricao(rs.getString(2));
			projetosSustentaveis.setCusto(rs.getDouble(3));
			projetosSustentaveis.setStatus(rs.getString(4));
			listaProjetosSustentaveis.add(projetosSustentaveis);
		}
		return listaProjetosSustentaveis;
	}

}
