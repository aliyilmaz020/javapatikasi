package repositoryDemo;

public interface IEntityRepository<T extends IEntity> { // DB işlemleri- T IEntity den alır
  void add(T entity);

  void delete(T entity);

  void update(T entity);
}
