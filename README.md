gwt-polymer
===========

Maven GWT application integrating Polymer

GWT

GWT is a development toolkit for building and optimizing complex browser-based applications. Its goal is to enable productive development of high-performance web applications without the developer having to be an expert in browser quirks, XMLHttpRequest, and JavaScript. GWT is used by many products at Google, including AdWords, AdSense, Flights, Hotel Finder, Offers, Wallet, Blogger. It's open source, completely free, and used by thousands of developers around the world.

Polymer

Web Components usher in a new era of web development based on encapsulated and interoperable custom elements that extend HTML itself. Built atop these new standards, Polymer makes it easier and faster to create anything from a button to a complete application across desktop, mobile, and beyond.

GWT + Polymer

A simple Maven + GWT application integrating with Polymer. 

Please run `bower install` in `src/main/webapp` to get the polymer components of the test App.

Known Issues in Dev
===================
WORKAROUND Using GWT Designer (with GWT 2.6.1/2.7.0, Eclipse 4.4, GPE 4.4)

see my post #15 in issue 8556, there is a work around

https://code.google.com/p/google-web-toolkit/issues/detail?id=8556#c15

You can upgrade the plugin and just switch the project to use gwt sdk 2.5.1 while you use the designer, then switch back
A little annoying but not much

--------------------------------
https://groups.google.com/forum/#!topic/google-web-toolkit/SRCpvbmkmTA
You're asking the wrong people actually.
GWT Designer is (was?) a Google product, maintained by Google (after they bought Instantiations), with a stripped-down version shipped with the Google Plugin for Eclipse. It's Google all the way down, and maintained by a different team inside Google than the one building GWT.
There was a need to change some internal API of GWT, and it happens that GWT Designer calls that API (hence the error); and nobody is actually actively maintaining GWT Designer. In 2.6.0, another change broke GWT Designer already, and we reintroduced the legacy code in 2.6.1 hoping GWT Designer would be fixed. It didn't happen (as far as I know). Because the GWT Team wants to move forward, even if that means breaking GWT Designer, we thought we had to mention the breaking change in GWT's release notes, but the reality is that the team behind GWT Designer don't actively maintain it anymore, and that team is not affiliated with GWT (besides many developers working in the same company).

BTW, if you're looking for GWT Designer's source code, it's there: https://code.google.com/p/gwt-designer/

