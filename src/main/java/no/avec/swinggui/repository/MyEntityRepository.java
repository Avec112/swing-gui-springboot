package no.avec.swinggui.repository;

import no.avec.swinggui.repository.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by avec on 22/03/2018.
 */
public interface MyEntityRepository extends JpaRepository<MyEntity, String> {
//    Collection<MyEntity> findByMyEntityName(String name);
}
