package com.we.sew.site.client.service.api;

import com.we.sew.site.client.view.command.SiteUserRegistrationCommand;
import com.we.sew.site.core.model.SiteUser;

/**
 * @author Vladyslav_Yemelianov
 */
public interface ISiteUserManager {
    SiteUser create(SiteUserRegistrationCommand bean);

    SiteUser findByEmail(String email);
}
