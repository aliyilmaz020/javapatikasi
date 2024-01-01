package repositoryDemo;

public interface IEntityRepository<T extends IEntity> { // DB işlemleri
  void add(T entity);

  void delete(T entity);

  void update(T entity);
}
