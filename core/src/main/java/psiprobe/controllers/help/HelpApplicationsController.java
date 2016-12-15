/**
 * Licensed under the GPL License. You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 * THIS PACKAGE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */
package psiprobe.controllers.help;

import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * The Class HelpApplicationsController.
 */
public class HelpApplicationsController extends ParameterizableViewController {

  // Hack fixing 'POST' with spring 4.3+
  public HelpApplicationsController() {
    super();
    setSupportedMethods(HttpMethod.GET.name(), HttpMethod.POST.name(), HttpMethod.HEAD.name());
  }

}
