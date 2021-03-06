<div id="content_main">
        <div class="custom-2-column" id="content-wrapper">
            <table class="lfr-grid" id="layout-grid">
                <tr>
                
                    <td class="lfr-column" colspan="2" id="column-1" valign="top">
                        $processor.processColumn("column-1")
                    </td>
                    
                        </tr>
                        <tr>
                            <td class="lfr-column" colspan="2" id="column-2" valign="top">
                                $processor.processColumn("column-2")
                            </td>

                        </tr>
                        <tr id="column-center">
                            <td class="lfr-column" id="main" valign="top">
                                $processor.processColumn("column-3")
                            </td>
                            <td class="lfr-column right_col" id="column-4" valign="top">
                                $processor.processColumn("column-4")
                            </td>
                        </tr>

                	</table>
                </div>
                	
                <div id="footer" class="lfr-column">
                    <div id="footdiv"></div>
                    <div id="footmenu">
                    <ul>
                        <li><a href="/web/guest/feedback">Contact</a></li>
                        <li><a href="/web/guest/resources/-/wiki/Main/Help">Help</a></li>
                            #if ($themeDisplay.signedIn)
                                <li><a href="/c/portal/logout">Sign out</a></li>
                            <li><a href="/web/guest/member/-/member/userId/$themeDisplay.user.userId">My profile</a></li>
                            #else 
                                <li><a href="/web/guest/loginregister" class="openreg">Register</a></li>
                                <li><a href="javascript:return false;" onclick="deferUntilLogin();">Sign In</a></li>
                            #end
                        </ul>
                    </div>

                    $processor.processColumn("column-5")
                </div> <!-- /footer -->
  </div> <!-- /content_wrap -->
