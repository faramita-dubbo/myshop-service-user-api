package org.faramita.myshop.service.user.api;

import org.faramita.myshop.commons.domain.TbUser;

import java.util.List;

public interface TbUserService {
    List<TbUser> selectAll();
}