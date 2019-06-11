package dao;

import entity.Office;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficeDao {
    List<Office> queryOffice();
}
