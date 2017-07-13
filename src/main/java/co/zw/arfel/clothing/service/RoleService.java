package co.zw.arfel.clothing.service;


import co.zw.arfel.clothing.model.Role;

import java.util.List;

/**
 * Created by micnice on 7/4/17.
 */


public interface RoleService {

  Role findByRole(String role);
  List<Role> findAll();
}
