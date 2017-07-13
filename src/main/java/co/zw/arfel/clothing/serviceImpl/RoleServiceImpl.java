package co.zw.arfel.clothing.serviceImpl;

import co.zw.arfel.clothing.model.Role;
import co.zw.arfel.clothing.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.zw.arfel.clothing.service.RoleService;

import java.util.List;

/**
 * Created by micnice on 7/4/17.
 */

@Service
public class RoleServiceImpl implements RoleService {
  @Autowired
  RoleRepository roleRepository;

  @Override
  public Role findByRole (String role) {
    return roleRepository.findByRole(role);
  }

  @Override
  public List<Role> findAll () {
    return roleRepository.findAll();
  }
}
