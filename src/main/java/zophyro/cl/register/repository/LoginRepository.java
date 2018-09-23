package zophyro.cl.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import zophyro.cl.register.model.db.LoginModel;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Long> {
    @Query("select u from LoginModel u where u.userId = :userid")
    List<LoginModel> findByUserId(@Param("userid") String userId);

    @Query("select u from LoginModel u where u.email = :email")
    List<LoginModel> findByEmail(@Param("email") String email);
}