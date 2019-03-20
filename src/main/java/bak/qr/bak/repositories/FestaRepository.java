package bak.qr.bak.repositories;

import bak.qr.bak.model.Festa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FestaRepository extends JpaRepository<Festa,Long> {
}
