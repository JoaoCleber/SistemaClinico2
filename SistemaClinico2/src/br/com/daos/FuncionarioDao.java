package br.com.daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.sistemaclinico.model2.Funcionario;
import br.com.sistemaclinico.util.ConnectionFactory;

public class FuncionarioDao {
	private Connection con;
	
public void salvar(Funcionario funcionario) throws Exception{
		
		try{
		
			// obter conexão
			con = ConnectionFactory.getConnection();
			// definir o comando SQL
			String sql = "INSERT INTO Funcionario (nome, cpf, rg, cargo, matricula) VALUES (?,?,?,?,?)";
			// obter statement a partir da conexão
			PreparedStatement st = con.prepareStatement(sql);
			// preencher statement
			st.setString(1, funcionario.getNome());
			st.setString(2, funcionario.getCpf());
			st.setString(3, funcionario.getRg());
			st.setString(4, funcionario.getCargo());
			st.setLong(5, funcionario.getMatricula());
			// executar comando
			st.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("Erro ao salvar Funcionario");
		}
		finally{
			
			con.close();
		}
		}
		public void atualizar(Funcionario funcionario) throws Exception{
			
			try{
				
				// obter conexão
				con = ConnectionFactory.getConnection();
				// definir o comando SQL
				String sql = "UPDATE Contato SET nome = ?, cpf = ?, rg = ?, cargo = ?, matricula = ?";
				// obter statement a partir da conexão
				PreparedStatement st = con.prepareStatement(sql);
				// preencher statement
				st.setString(1, funcionario.getNome());
				st.setString(2, funcionario.getCpf());
				st.setString(3, funcionario.getRg());
				st.setString(4, funcionario.getCargo());
				st.setLong(5, funcionario.getMatricula());
				// executar comando
				st.executeUpdate();
				
			}catch(Exception e){
				e.printStackTrace();
				throw new Exception("Erro ao atualizar contato");
			}finally{
				
				con.close();
			}
			}
			public void remover(Funcionario	funcionario) throws Exception{
				
				try{
					
					// obter conexão
					con = ConnectionFactory.getConnection();
					// definir o comando SQL
					String sql = "DELETE FROM Contato WHERE matricula = ?";
					// obter statement a partir da conexão
					PreparedStatement st = con.prepareStatement(sql);
					// preencher statement
					st.setLong(1, funcionario.getMatricula());
					// executar comando
					st.executeUpdate();
					
				}catch(Exception e){
					e.printStackTrace();
					throw new Exception("Erro ao remover funcionario");
				}finally{
					
					con.close();
					
				}
			}
			
			public List<Funcionario> getLista() throws Exception{
				
				List<Funcionario> lista = new ArrayList<>();
				
				try{
					
					// obter conexão
					con = ConnectionFactory.getConnection();
					// definir o comando SQL
					String sql = "SELECT * FROM Funcionario";
					// obter statement a partir da conexão
					PreparedStatement st = con.prepareStatement(sql);
					
					// executar comando
					ResultSet rs = st.executeQuery();
					
					while(rs.next()){
						
						Funcionario funcionario = new Funcionario();
						
						funcionario.setNome(rs.getString("Nome"));
						funcionario.setCpf(rs.getString("CPF"));
						funcionario.setRg(rs.getString("RG"));
						funcionario.setCargo(rs.getString("Cargo"));
						funcionario.setMatricula(rs.getInt("Matricula"));
						
						lista.add(funcionario);
					}
					
					return lista;
					
				}catch(Exception e){
					e.printStackTrace();
					throw new Exception("Erro ao salvar contato");
				}finally{
					
					con.close();
					
				}
				
			}
			
			public Funcionario get(long matricula){
				return null;
			}
}
