package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Carro;
import br.com.fiap.conexoes.ConexaoFactory;

public class CarroDAO {

	public Connection minhaConexao;

	public CarroDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().Conexao();
	}

	// insert
	public String inserir(Carro carro) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement("Insert into Carro values (?, ?, ?, ?)");

		stmt.setInt(1, carro.getIdCarro());
		stmt.setString(2, carro.getMarca());
		stmt.setString(3, carro.getModelo());
		stmt.setDouble(4, carro.getValor());
		

		return "Carro cadastrado com sucesso";
	}

	// Delete
	public String deletar(int idCarro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from Carro where id_carro = ?");
		stmt.setInt(1, idCarro);
		stmt.execute();
		stmt.close();
		return "Deletado com Sucesso!";
	}

	// UpDate
	public String atualizar(Carro carro) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement("Update Carro set marca = ?, " 
						+ "modelo = ?, " + "valor = ? where id_carro = ?");
		stmt.setString(1, carro.getMarca());
		stmt.setString(2, carro.getModelo());
		stmt.setDouble(3, carro.getValor());
		stmt.setInt(4, carro.getIdCarro());
		stmt.executeUpdate();
		stmt.close();
		return "Atualizado com Sucesso!";
	}

	// Select
	public List<Carro> selecionar() throws SQLException {
		List<Carro> listaCarro = new ArrayList<Carro>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM Carro");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Carro carro = new Carro();
			carro.setIdCarro(rs.getInt(1));
			carro.setMarca(rs.getString(2));
			carro.setModelo(rs.getString(3));
			carro.setValor(rs.getDouble(4));
			listaCarro.add(carro);
		}
		return listaCarro;
	}

}
