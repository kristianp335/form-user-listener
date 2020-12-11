package com.liferay.kris.form.user.listener;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(
    id = FormUserAccountListenerConfiguration.PID,
    localization = "content/Language",
    name = "form-user-account-listener-config-name"
)
public interface FormUserAccountListenerConfiguration {

  @Meta.AD(
      name = "form-user-account-listener-form-id",
      description = "You can find this information after creating a form under 'Content & Data > Forms' in a site",
      required = false
  )
  public long formId();

  public static final String PID = "com.liferay.kris.form.user.listener.FormUserAccountListenerConfiguration";

}
