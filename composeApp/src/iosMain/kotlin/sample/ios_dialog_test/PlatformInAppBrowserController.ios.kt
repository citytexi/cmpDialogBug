package sample.ios_dialog_test

import platform.Foundation.NSURL
import platform.SafariServices.SFSafariViewController
import platform.UIKit.UIApplication
import platform.UIKit.UIModalPresentationFullScreen
import platform.UIKit.UIViewController

actual object PlatformInAppBrowserController {

    private var lastPresentViewController: SFSafariViewController? = null

    private val rootViewController: UIViewController?
        get() = UIApplication.sharedApplication.keyWindow?.rootViewController

    actual fun launch(url: String) {
        val rootViewController = rootViewController ?: return
        val viewController = NSURL.URLWithString(url)?.let { nsUrl -> SFSafariViewController(nsUrl) } ?: return
        viewController.modalPresentationStyle = UIModalPresentationFullScreen
        lastPresentViewController = viewController

        rootViewController.presentViewController(
            viewControllerToPresent = viewController,
            animated = true,
            completion = {},
        )
    }
}