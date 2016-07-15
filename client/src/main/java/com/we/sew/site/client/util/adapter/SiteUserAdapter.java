package com.we.sew.site.client.util.adapter;

import com.we.sew.site.client.view.command.SiteUserRegistrationCommand;
import com.we.sew.site.client.util.adapter.api.EntityAdapter;
import com.we.sew.site.core.model.SiteUser;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * @author Vladyslav_Yemelianov
 */
@Component
public class SiteUserAdapter implements EntityAdapter<SiteUser, SiteUserRegistrationCommand> {
    @Override
    public SiteUser adapt(SiteUserRegistrationCommand el) {
        SiteUser siteUser = new SiteUser();
        siteUser.setEmail(el.getEmail());
        siteUser.setFirstName(el.getFirstName());
        siteUser.setLastName(el.getLastName());
        siteUser.setPassword(DigestUtils.md5DigestAsHex(el.getPassword().getBytes()));
        return siteUser;
    }
}
