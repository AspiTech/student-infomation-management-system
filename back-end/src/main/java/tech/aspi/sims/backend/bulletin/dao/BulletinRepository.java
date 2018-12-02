package tech.aspi.sims.backend.bulletin.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tech.aspi.sims.backend.bulletin.model.Bulletin;

import javax.websocket.server.PathParam;

@RepositoryRestResource
public interface BulletinRepository extends CrudRepository<Bulletin, Integer> {

}
