package db.daos;

import db.models.MigParaleloProfesor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class MigParaleloProfesorDao extends AbstractDao implements Dao<MigParaleloProfesor>{
  public MigParaleloProfesorDao(Connection conn) {
    super(conn);
  }

  @Override
  public Optional<MigParaleloProfesor> get(long id) throws SQLException {
    return Optional.empty();
  }

  @Override
  public List<MigParaleloProfesor> getAll() throws SQLException {
    return null;
  }

  @Override
  public long save(MigParaleloProfesor migParaleloProfesor) throws Exception {
    return 0;
  }

  @Override
  public MigParaleloProfesor saveAndRetrieveIntance(MigParaleloProfesor migParaleloProfesor) throws Exception {
    return null;
  }

  @Override
  public List<Long> saveAll(List<MigParaleloProfesor> t) {
    return null;
  }

  @Override
  public void update(MigParaleloProfesor migParaleloProfesor, String[] params) {

  }

  @Override
  public void delete(MigParaleloProfesor migParaleloProfesor) {

  }

  @Override
  public int count() throws SQLException {
    return 0;
  }
}