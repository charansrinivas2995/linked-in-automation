package framework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.events.WebDriverListener;

public class Listners implements WebDriverListener {

	public void afterAccept(Alert alert) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterAccept(alert);
	}

	public void afterAddCookie(Options options, Cookie cookie) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterAddCookie(options, cookie);
	}

	public void afterAnyAlertCall(Alert alert, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterAnyAlertCall(alert, method, args, result);
	}

	public void afterAnyCall(Object target, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterAnyCall(target, method, args, result);
	}

	public void afterAnyNavigationCall(Navigation navigation, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterAnyNavigationCall(navigation, method, args,
		// result);
	}

	public void afterAnyOptionsCall(Options options, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterAnyOptionsCall(options, method, args, result);
	}

	public void afterAnyTimeoutsCall(Timeouts timeouts, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterAnyTimeoutsCall(timeouts, method, args, result);
	}

	public void afterAnyWebDriverCall(WebDriver driver, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterAnyWebDriverCall(driver, method, args, result);
	}

	public void afterAnyWebElementCall(WebElement element, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterAnyWebElementCall(element, method, args,
		// result);
	}

	public void afterAnyWindowCall(Window window, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterAnyWindowCall(window, method, args, result);
	}

	public void afterBack(Navigation navigation) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterBack(navigation);
	}

	public void afterClear(WebElement element) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterClear(element);
	}

	public void afterClick(WebElement element) {
		// WebDriverListener.super.afterClick(element);
		System.out.println("PASS : Element click successfully " + element.getText());
	}

	public void afterClose(WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterClose(driver);
	}

	public void afterDeleteAllCookies(Options options) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterDeleteAllCookies(options);
	}

	public void afterDeleteCookie(Options options, Cookie cookie) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterDeleteCookie(options, cookie);
	}

	public void afterDeleteCookieNamed(Options options, String name) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterDeleteCookieNamed(options, name);
	}

	public void afterDismiss(Alert alert) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterDismiss(alert);
	}

	public void afterExecuteAsyncScript(WebDriver driver, String script, Object[] args, Object result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterExecuteAsyncScript(driver, script, args,
		// result);
	}

	public void afterExecuteScript(WebDriver driver, String script, Object[] args, Object result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterExecuteScript(driver, script, args, result);
	}

	public void afterFindElement(WebDriver driver, By locator, WebElement result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterFindElement(driver, locator, result);
	}

	public void afterFindElement(WebElement element, By locator, WebElement result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterFindElement(element, locator, result);
	}

	public void afterFindElements(WebDriver driver, By locator, List<WebElement> result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterFindElements(driver, locator, result);
	}

	public void afterFindElements(WebElement element, By locator, List<WebElement> result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterFindElements(element, locator, result);
	}

	public void afterForward(Navigation navigation) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterForward(navigation);
	}

	public void afterFullscreen(Window window) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterFullscreen(window);
	}

	public void afterGet(WebDriver driver, String url) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGet(driver, url);
	}

	public void afterGetAttribute(WebElement element, String name, String result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetAttribute(element, name, result);
	}

	public void afterGetCookieNamed(Options options, String name, Cookie result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetCookieNamed(options, name, result);
	}

	public void afterGetCookies(Options options, Set<Cookie> result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetCookies(options, result);
	}

	public void afterGetCssValue(WebElement element, String propertyName, String result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetCssValue(element, propertyName, result);
	}

	public void afterGetCurrentUrl(String result, WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetCurrentUrl(result, driver);
	}

	public void afterGetLocation(WebElement element, Point result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetLocation(element, result);
	}

	public void afterGetPageSource(WebDriver driver, String result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetPageSource(driver, result);
	}

	public void afterGetPosition(Window window, Point result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetPosition(window, result);
	}

	public void afterGetSize(WebElement element, Dimension result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetSize(element, result);
	}

	public void afterGetSize(Window window, Dimension result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetSize(window, result);
	}

	public void afterGetTagName(WebElement element, String result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetTagName(element, result);
	}

	public void afterGetText(Alert alert, String result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetText(alert, result);
	}

	public void afterGetText(WebElement element, String result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetText(element, result);
	}

	public void afterGetTitle(WebDriver driver, String result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetTitle(driver, result);
	}

	public void afterGetWindowHandle(WebDriver driver, String result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetWindowHandle(driver, result);
	}

	public void afterGetWindowHandles(WebDriver driver, Set<String> result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterGetWindowHandles(driver, result);
	}

	public void afterImplicitlyWait(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterImplicitlyWait(timeouts, duration);
	}

	public void afterIsDisplayed(WebElement element, boolean result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterIsDisplayed(element, result);
	}

	public void afterIsEnabled(WebElement element, boolean result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterIsEnabled(element, result);
	}

	public void afterIsSelected(WebElement element, boolean result) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterIsSelected(element, result);
	}

	public void afterMaximize(Window window) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterMaximize(window);
	}

	public void afterPageLoadTimeout(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterPageLoadTimeout(timeouts, duration);
	}

	public void afterPerform(WebDriver driver, Collection<Sequence> actions) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterPerform(driver, actions);
	}

	public void afterQuit(WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterQuit(driver);
	}

	public void afterRefresh(Navigation navigation) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterRefresh(navigation);
	}

	public void afterResetInputState(WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterResetInputState(driver);
	}

	public void afterSendKeys(Alert alert, String text) {
		// WebDriverListener.super.afterSendKeys(alert, text);
		System.out.println("PASS : Send Keys performed successfully " + text);
	}

	public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
		// WebDriverListener.super.afterSendKeys(element, keysToSend);
		System.out.println("PASS : Send Keys performed successfully " + keysToSend);
	}

	public void afterSetPosition(Window window, Point position) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterSetPosition(window, position);
	}

	public void afterSetScriptTimeout(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterSetScriptTimeout(timeouts, duration);
	}

	public void afterSetSize(Window window, Dimension size) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterSetSize(window, size);
	}

	public void afterSubmit(WebElement element) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterSubmit(element);
	}

	public void afterTo(Navigation navigation, String url) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterTo(navigation, url);
	}

	public void afterTo(Navigation navigation, URL url) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.afterTo(navigation, url);
	}

	public void beforeAccept(Alert alert) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeAccept(alert);
	}

	public void beforeAddCookie(Options options, Cookie cookie) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeAddCookie(options, cookie);
	}

	public void beforeAnyAlertCall(Alert alert, Method method, Object[] args) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeAnyAlertCall(alert, method, args);
	}

	public void beforeAnyCall(Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeAnyCall(target, method, args);
	}

	public void beforeAnyNavigationCall(Navigation navigation, Method method, Object[] args) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeAnyNavigationCall(navigation, method, args);
	}

	public void beforeAnyOptionsCall(Options options, Method method, Object[] args) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeAnyOptionsCall(options, method, args);
	}

	public void beforeAnyTimeoutsCall(Timeouts timeouts, Method method, Object[] args) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeAnyTimeoutsCall(timeouts, method, args);
	}

	public void beforeAnyWebDriverCall(WebDriver driver, Method method, Object[] args) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeAnyWebDriverCall(driver, method, args);
	}

	public void beforeAnyWebElementCall(WebElement element, Method method, Object[] args) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeAnyWebElementCall(element, method, args);
	}

	public void beforeAnyWindowCall(Window window, Method method, Object[] args) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeAnyWindowCall(window, method, args);
	}

	public void beforeBack(Navigation navigation) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeBack(navigation);
	}

	public void beforeClear(WebElement element) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeClear(element);
	}

	public void beforeClick(WebElement element) {
		// WebDriverListener.super.beforeClick(element);
		System.out.println("WAITING : To click on element " + element.getText());
	}

	public void beforeClose(WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeClose(driver);
	}

	public void beforeDeleteAllCookies(Options options) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeDeleteAllCookies(options);
	}

	public void beforeDeleteCookie(Options options, Cookie cookie) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeDeleteCookie(options, cookie);
	}

	public void beforeDeleteCookieNamed(Options options, String name) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeDeleteCookieNamed(options, name);
	}

	public void beforeDismiss(Alert alert) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeDismiss(alert);
	}

	public void beforeExecuteAsyncScript(WebDriver driver, String script, Object[] args) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeExecuteAsyncScript(driver, script, args);
	}

	public void beforeExecuteScript(WebDriver driver, String script, Object[] args) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeExecuteScript(driver, script, args);
	}

	public void beforeFindElement(WebDriver driver, By locator) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeFindElement(driver, locator);
	}

	public void beforeFindElement(WebElement element, By locator) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeFindElement(element, locator);
	}

	public void beforeFindElements(WebDriver driver, By locator) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeFindElements(driver, locator);
	}

	public void beforeFindElements(WebElement element, By locator) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeFindElements(element, locator);
	}

	public void beforeForward(Navigation navigation) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeForward(navigation);
	}

	public void beforeFullscreen(Window window) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeFullscreen(window);
	}

	public void beforeGet(WebDriver driver, String url) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGet(driver, url);
	}

	public void beforeGetAttribute(WebElement element, String name) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetAttribute(element, name);
	}

	public void beforeGetCookieNamed(Options options, String name) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetCookieNamed(options, name);
	}

	public void beforeGetCookies(Options options) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetCookies(options);
	}

	public void beforeGetCssValue(WebElement element, String propertyName) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetCssValue(element, propertyName);
	}

	public void beforeGetCurrentUrl(WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetCurrentUrl(driver);
	}

	public void beforeGetLocation(WebElement element) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetLocation(element);
	}

	public void beforeGetPageSource(WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetPageSource(driver);
	}

	public void beforeGetPosition(Window window) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetPosition(window);
	}

	public void beforeGetSize(WebElement element) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetSize(element);
	}

	public void beforeGetSize(Window window) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetSize(window);
	}

	public void beforeGetTagName(WebElement element) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetTagName(element);
	}

	public void beforeGetText(Alert alert) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetText(alert);
	}

	public void beforeGetText(WebElement element) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetText(element);
	}

	public void beforeGetTitle(WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetTitle(driver);
	}

	public void beforeGetWindowHandle(WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetWindowHandle(driver);
	}

	public void beforeGetWindowHandles(WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeGetWindowHandles(driver);
	}

	public void beforeImplicitlyWait(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeImplicitlyWait(timeouts, duration);
	}

	public void beforeIsDisplayed(WebElement element) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeIsDisplayed(element);
	}

	public void beforeIsEnabled(WebElement element) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeIsEnabled(element);
	}

	public void beforeIsSelected(WebElement element) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeIsSelected(element);
	}

	public void beforeMaximize(Window window) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeMaximize(window);
	}

	public void beforePageLoadTimeout(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforePageLoadTimeout(timeouts, duration);
	}

	public void beforePerform(WebDriver driver, Collection<Sequence> actions) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforePerform(driver, actions);
	}

	public void beforeQuit(WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeQuit(driver);
	}

	public void beforeRefresh(Navigation navigation) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeRefresh(navigation);
	}

	public void beforeResetInputState(WebDriver driver) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeResetInputState(driver);
	}

	public void beforeSendKeys(Alert alert, String text) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeSendKeys(alert, text);
	}

	public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
		// WebDriverListener.super.beforeSendKeys(element, keysToSend);
		System.out.println("WAITING : To eneter text in  '" + keysToSend + "' in " + element.getText());
	}

	public void beforeSetPosition(Window window, Point position) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeSetPosition(window, position);
	}

	public void beforeSetScriptTimeout(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeSetScriptTimeout(timeouts, duration);
	}

	public void beforeSetSize(Window window, Dimension size) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeSetSize(window, size);
	}

	public void beforeSubmit(WebElement element) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeSubmit(element);
	}

	public void beforeTo(Navigation navigation, String url) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeTo(navigation, url);
	}

	public void beforeTo(Navigation navigation, URL url) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.beforeTo(navigation, url);
	}

	public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
		// TODO Auto-generated method stub
		// WebDriverListener.super.onError(target, method, args, e);
	}

}
