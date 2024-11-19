package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.TipoFonte;
import br.com.fiap.conexoes.ConexaoFactory;

public class TipoFonteDAO {

	public Connection minhaConexao;

	public TipoFonteDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().Conexao();
	}

	// insert
	public String inserir(TipoFonte tipoFonte) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement("Insert into Tipo_Fonte values (?, ?)");

		stmt.setInt(1, tipoFonte.getIdTipoFonte());
		stmt.setString(2, tipoFonte.getNome());
		

		return "Tipo de Fonte cadastrada com sucesso";
	}

	// Delete
	public String deletar(int idTipoFonte) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from Tipo_Fonte where id_tipo_Fonte = ?");
		stmt.setInt(1, idTipoFonte);
		stmt.execute();
		stmt.close();
		return "Deletado com Sucesso!";
	}

	// UpDate
	public String atualizar(TipoFonte tipoFonte) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement(" Update Tipo_Fonte set NOME = ? where id_tipo_fonte = ?");
		stmt.setString(1, tipoFonte.getNome());
		stmt.setInt(2, tipoFonte.getIdTipoFonte());
		stmt.executeUpdate();
		stmt.close();
		return "Atualizado com Sucesso!";
	}

	// Select
	public List<TipoFonte> selecionar() throws SQLException {
		List<TipoFonte> listaTipoFonte = new ArrayList<TipoFonte>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM Tipo_Fonte");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			TipoFonte tipoFonte = new TipoFonte();
			tipoFonte.setIdTipoFonte(rs.getInt(1));
			tipoFonte.setNome(rs.getString(2));
			listaTipoFonte.add(tipoFonte);
		}
		return listaTipoFonte;
	}

}
