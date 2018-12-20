<font color='silver'><< Older</font> | [Newer >>](Changelogs.md)

---


## 2.0 (unreleased) ##
  * ([issue 58](https://code.google.com/p/psi-probe/issues/detail?id=58)) MISC: Upgraded Spring Framework to 2.0.1
  * ([issue 61](https://code.google.com/p/psi-probe/issues/detail?id=61)) NEW: French translation by Bruno Haleblian.
  * ([issue 44](https://code.google.com/p/psi-probe/issues/detail?id=44)) NEW: Brasilian Portugese translation by Leandro de Oliveira
  * ([issue 62](https://code.google.com/p/psi-probe/issues/detail?id=62)) FIX: Engine name is no longer hardcoded to "Catalina", this should allow support for embedded Tomcat.
  * ([issue 59](https://code.google.com/p/psi-probe/issues/detail?id=59)) NEW: Dynamic locale selector
  * ([issue 63](https://code.google.com/p/psi-probe/issues/detail?id=63)) NEW: Requests and average response time charts for applications (on application summary page)

## 1.7 beta ##
  * NEW: Session search tool.
  * NEW: UI improvement: features related to the same application are now conveniently grouped in the second level of navigation menu.
  * MISC: Added ability to view logs of stopped applications.
  * MISC: Ajaxed application stop/start/restart tools.
  * NEW: IP address of the latest session user is now displayed in session list screen. Also added ability to run WHOIS query on that IP address. Some (redundant) columns have been removed from this screen.
  * MISC: Added first element of the thread execution stack to the list of threads screen.
  * NEW: Ability to view application deployment descriptor & context descriptor
  * NEW: Ability to view servlet definitions, mappings and statistic
  * NEW: New column in the list of applications table: REQ - number of requests processed by the application.
  * NEW: Ability to view filter definitions and mapping
  * NEW: Ability to view application parameters
  * MISC: Added partial support for Tomcat 6. "Filter mappings" pages does not work on Tomcat 6 though.
  * NEW: Session list page and status page now display flag of the IP address locale country.

## 1.6.0.1 ##
  * BUG: Lambda Probe may fail to startup if stats file is corrupt.
  * BUG: Fixed incorrect interpretation of org.jstripe.intruments.ignoreNIO system property.
  * MISC: OS information page would now display limited set of functionality (all whats currently available) for IBM JDK users.

## 1.6 ##
  * MISC: Cluster support is disabled for Tomcat versions that do not export "Catalina:type=ClusterMembership" mbean.
  * NEW: Datasource test tool. Ability to test datasource by executing a SQL.
  * NEW: New thread view for Java5 with enabled instrumentation api.
  * MISC: Quick check now checks for availability of webapps.
  * MISC: Size estimation tool now requires privileged role.
  * MISC: Logs view will now work on IBM JVM.
  * BUG: Fixed possible problems with request encoding (http://www.lambdaprobe.org/forum2/thread.jspa?threadID=96). Thanks to Kan Ogawa for the patch.
  * NEW: Added ability to do "whois" query on the IP address on "status" tab.
  * MISC: Added workaround for JVM crash on doing refleciton on java.nio.`*` classes.
  * BUG: Fixed incompatibility issues with IBM JDK, thanks to "move" for the patch! (http://www.lambdaprobe.org/forum2/thread.jspa?threadID=107&tstart=0)
  * NEW: All stats are kept and restored in case of JVM restart or crash.

## 1.5.0.1 ##
  * MISC: Ability to force a particular container adaptor. (spring-resources.xml)
  * MISC: Scriptaculous and prototype libraries upgrades to 1.6.1
  * MISC: Changed affects on "what are those abbreviations" to make them look ok in IE.

## 1.5 ##
  * MISC: Minor UI updates to introduce second level of navigation.
  * MISC: Converted .png icons to .gif so to get IE handle transparency correctly.
  * NEW: Support for Java Service Wrapper 3.2 or higher. Ability to stop and restart Tomcat.
  * MISC: System properties are now in a separate view.
  * MISC: Memory tab moved to "System properties"
  * MISC: System properties can now be ordered by both name and value.
  * NEW: Ability to monitor server physical memory usage, swap space usage and CPU utilisation by JVM.
  * MISC: New role "poweruserplus" has been added. This role has the same privileges as "poweruser" plus it allows to restart JVM.
  * MISC: Added min-help to explain abbreviations.
  * BUG: Incorrect file encoding was used to display JSP and servlet source. Patch submitted by Kan Ogawa (http://www.lambdaprobe.org/forum2/thread.jspa?threadID=60)
  * BUG: Possible NPE on memory monitoring page (http://www.lambdaprobe.org/forum2/thread.jspa?threadID=68)

## 1.4 ##
  * NEW: Ability to group datasources by jdbc URL to assist database capacity planning. (Andy)
  * NEW: Ability to filter out certain System.properties key in order to hide privileged information from Probe users. (Vlad)
  * NEW: Ability to monitor memory usage via Java5 monitoring agent. (Vlad)
  * MISC: Log list now contains only existing log files. (Vlad)
  * MISC: Ability to configure file names where java standard output is redirected (Vlad)
  * MISC: Added support for `<jsp-config>` element of web.xml with custom JSP mappings. (Vlad)
  * NEW: Ability to view and download auto-generated servlet files for JSPs. (Vlad)
  * MISC: Added ability to clear screen buffer when tailing a log file. (Vlad)

## 1.3.0.3 ##
  * BUG: NPE when compiling JSPs recursively. Thanks to Jandson Almeida da Silva for the bug report. (Vlad)
  * NEW: Ability to tail log files from browser. (Vlad)
  * NEW: Ability to "remember" state of the chart groups (Vlad)
  * NEW: Ability to view logs of stopped contexts (Vlad)
  * NEW: "Cluster" tab. Ability to monitor cluster membership and traffic. Many thanks to Peter Rossbach for support and ideas. (Vlad)
  * NEW: Ability to view servlet context attributes (Andy Shapoval)
  * NEW: Ability to view Tomcat console output redirected to files such as catalina.out
  * BUG: Small fix to enable "logs" tab on Macs.

## 1.2 ##
  * BUG: Division by zero exception if datasource is configured to have maximum of 0 (zero) connections.
  * BUG: "Logs" tag now recovers gracefully from exceptions to do with unknown/misconfigured loggers.
  * NEW: Added Japaneese translation. Many thanks to Kan Ogawa!
  * BUG: Root context "/" could not be restarted or executed any action on. Thanks to Xavier Gorse for the bug report.
  * NEW: JSP source syntax highlighting.
  * BUG: ThreadDeath exception on "logs" tab. Thanks to SammyRulez for reporting the bug.
  * NEW: Added support for JBoss+Tomcat
  * NEW: Ability to view and reset JBoss datasources.
  * BUG: ThreadDeath exception was not re-thrown, which may have caused some Threads not to die and applications not to restart.
  * MISC: Improved accuracy of sessions size estimation.
  * NEW: Added Russian translation.

## 1.1 ##
  * BUG: .war deployment may fail, thanks to Kan Ogawa for the patch
  * BUG: "undeploy" may fail if Tomcat working directory is not $CATALINA\_BASE; reported by Daniel Serodio
  * BUG: build.xml would not copy some of the resources creating unusable distribution.
  * BUG: JSP source viewer may fail intermittently
  * BUG: JSP source viewer could not display jsp files from packaged webapps, thanks Kan Ogawa for the patch.
  * BUG: JSP source viewer did not honor pageEncoding directive and was displaying some JSPs incorrectly; reported by Kan Ogawa
  * BUG: page-encoding element of deployment descriptor was not honored. Thanks to Kan Ogawa for the patch.
  * BUG: Fixed CSS issues with :hover support in IE. Now IE UI looks almost as good as Firefox.
  * NEW: "Charts" tab. Real time connector usage charts and statistics.
  * NEW: System information page now displays "container information"
  * BUG: ResourceLink resources are now recognized and marked appropriately in datasource and application resource views; reported by Eric Lee
  * NEW: "Logs" tab. Ability to scan for possible log files and download selected files from the browser.
  * SRC: commons-logging is implemented throughout the application, log4j is still included in the distribution but it is optional.
  * UI enhancements.

## 1.0.9 BETA ##
  * BUG: session attribute view did not xmlescape attribute values
  * BUG: context deployment (deployment option #2) did not work. The form parameter name was incorrect.
  * NEW: Ability to estimate memory footprint of a sessions attribute, session or all sessions in a webapp.
  * FIX: minor UI improvements
  * NEW: Ability to view JSP files and their current status (out of date or compiled)
  * NEW: Ability to discard "work" directories.
  * NEW: Ability to recompile either selected JSPs or all JSPs in a webapp.
  * NEW: Ability to upload WAR, discard work directory and/or recompile JSPs in one short step.
  * BUG: NPE during .war deployment if java.io.tmpdir is not configured correctly.

## 1.0.8.3 BETA ##
  * BUG: NPE in xml version of quick check
  * BUG: Intermittent javax.management.InstanceNotFoundException in quick check html page
  * BUG: small fixes

## 1.0.8 BETA ##
  * BUG: Root context "/" is no longer ignored.
  * NEW: Added support for Oracle connection pool
  * NEW: Added session attribute view (entry point is on
  * BUG: Probe would display exception screen if there are applications with no JNDI context.
  * Tweaked CSS to improve look and feel and fix some minor browser incompatibilities
  * Refactored CSS, java and JSP code
  * NEW: Added "serializable" column to application list and session list view to indicate possible persistance problems.
  * Improved session list view to indicate age and idleness of sessions

## 1.0.7 BETA ##
  * Initial release