/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.handmark.pulltorefresh.library;

public final class R {
    public static final class anim {
        public static int slide_in_from_bottom=0x7f040000;
        public static int slide_in_from_top=0x7f040001;
        public static int slide_out_to_bottom=0x7f040002;
        public static int slide_out_to_top=0x7f040003;
    }
    public static final class attr {
        /**  BELOW HERE ARE DEPRECEATED. DO NOT USE. 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int ptrAdapterViewBackground=0x7f010010;
        /**  Style of Animation should be used displayed when pulling. 
         <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>rotate</code></td><td>0x0</td><td></td></tr>
<tr><td><code>flip</code></td><td>0x1</td><td></td></tr>
</table>
         */
        public static int ptrAnimationStyle=0x7f01000c;
        /**  Drawable to use as Loading Indicator. Changes both Header and Footer. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrDrawable=0x7f010006;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrDrawableBottom=0x7f010012;
        /**  Drawable to use as Loading Indicator in the Footer View. Overrides value set in ptrDrawable. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrDrawableEnd=0x7f010008;
        /**  Drawable to use as Loading Indicator in the Header View. Overrides value set in ptrDrawable. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrDrawableStart=0x7f010007;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrDrawableTop=0x7f010011;
        /**  A drawable to use as the background of the Header and Footer Loading Views 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int ptrHeaderBackground=0x7f010001;
        /**  Text Color of the Header and Footer Loading Views Sub Header 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int ptrHeaderSubTextColor=0x7f010003;
        /**  Base text color, typeface, size, and style for Header and Footer Loading Views 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrHeaderTextAppearance=0x7f01000a;
        /**  Text Color of the Header and Footer Loading Views 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int ptrHeaderTextColor=0x7f010002;
        /** 
        	Whether PullToRefreshListView has it's extras enabled. This allows the user to be 
        	able to scroll while refreshing, and behaves better. It acheives this by adding
        	Header and/or Footer Views to the ListView.
        
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static int ptrListViewExtrasEnabled=0x7f01000e;
        /**  Mode of Pull-to-Refresh that should be used 
         <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>disabled</code></td><td>0x0</td><td></td></tr>
<tr><td><code>pullFromStart</code></td><td>0x1</td><td></td></tr>
<tr><td><code>pullFromEnd</code></td><td>0x2</td><td></td></tr>
<tr><td><code>both</code></td><td>0x3</td><td></td></tr>
<tr><td><code>manualOnly</code></td><td>0x4</td><td></td></tr>
<tr><td><code>pullDownFromTop</code></td><td>0x1</td><td> These last two are depreacted </td></tr>
<tr><td><code>pullUpFromBottom</code></td><td>0x2</td><td></td></tr>
</table>
         */
        public static int ptrMode=0x7f010004;
        /**  Whether Android's built-in Over Scroll should be utilised for Pull-to-Refresh. 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static int ptrOverScroll=0x7f010009;
        /**  A drawable to use as the background of the Refreshable View 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int ptrRefreshableViewBackground=0x7f010000;
        /** 
        	Whether the Drawable should be continually rotated as you pull. This only
        	takes effect when using the 'Rotate' Animation Style.
        
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static int ptrRotateDrawableWhilePulling=0x7f01000f;
        /**  Whether the user can scroll while the View is Refreshing 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static int ptrScrollingWhileRefreshingEnabled=0x7f01000d;
        /**  Whether the Indicator overlay(s) should be used 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static int ptrShowIndicator=0x7f010005;
        /**  Base text color, typeface, size, and style for Header and Footer Loading Views Sub Header 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrSubHeaderTextAppearance=0x7f01000b;
    }
    public static final class dimen {
        public static int header_footer_left_right_padding=0x7f060003;
        public static int header_footer_top_bottom_padding=0x7f060004;
        public static int indicator_corner_radius=0x7f060001;
        public static int indicator_internal_padding=0x7f060002;
        public static int indicator_right_padding=0x7f060000;
    }
    public static final class drawable {
        public static int default_ptr_flip=0x7f020000;
        public static int default_ptr_rotate=0x7f020001;
        public static int ic_launcher=0x7f020002;
        public static int indicator_arrow=0x7f020003;
        public static int indicator_bg_bottom=0x7f020004;
        public static int indicator_bg_top=0x7f020005;
    }
    public static final class id {
        public static int both=0x7f050003;
        public static int disabled=0x7f050000;
        public static int fl_inner=0x7f05000d;
        public static int flip=0x7f050008;
        public static int gridview=0x7f050009;
        public static int manualOnly=0x7f050004;
        public static int menu_settings=0x7f050012;
        public static int pullDownFromTop=0x7f050005;
        public static int pullFromEnd=0x7f050002;
        public static int pullFromStart=0x7f050001;
        public static int pullUpFromBottom=0x7f050006;
        public static int pull_to_refresh_image=0x7f05000e;
        public static int pull_to_refresh_progress=0x7f05000f;
        public static int pull_to_refresh_sub_text=0x7f050011;
        public static int pull_to_refresh_text=0x7f050010;
        public static int rotate=0x7f050007;
        public static int scrollview=0x7f05000b;
        public static int viewpager=0x7f05000c;
        public static int webview=0x7f05000a;
    }
    public static final class layout {
        public static int activity_main=0x7f030000;
        public static int pull_to_refresh_header_horizontal=0x7f030001;
        public static int pull_to_refresh_header_vertical=0x7f030002;
    }
    public static final class menu {
        public static int activity_main=0x7f090000;
    }
    public static final class string {
        public static int app_name=0x7f070006;
        public static int hello_world=0x7f070007;
        public static int menu_settings=0x7f070008;
        /**  Just use standard Pull Down String when pulling up. These can be set for languages which require it 
         */
        public static int pull_to_refresh_from_bottom_pull_label=0x7f070003;
        public static int pull_to_refresh_from_bottom_refreshing_label=0x7f070005;
        public static int pull_to_refresh_from_bottom_release_label=0x7f070004;
        public static int pull_to_refresh_pull_label=0x7f070000;
        public static int pull_to_refresh_refreshing_label=0x7f070002;
        public static int pull_to_refresh_release_label=0x7f070001;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static int AppBaseTheme=0x7f080000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static int AppTheme=0x7f080001;
    }
    public static final class styleable {
        /** Attributes that can be used with a PullToRefresh.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #PullToRefresh_ptrAdapterViewBackground com.handmark.pulltorefresh.library:ptrAdapterViewBackground}</code></td><td> BELOW HERE ARE DEPRECEATED.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrAnimationStyle com.handmark.pulltorefresh.library:ptrAnimationStyle}</code></td><td> Style of Animation should be used displayed when pulling.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawable com.handmark.pulltorefresh.library:ptrDrawable}</code></td><td> Drawable to use as Loading Indicator.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableBottom com.handmark.pulltorefresh.library:ptrDrawableBottom}</code></td><td></td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableEnd com.handmark.pulltorefresh.library:ptrDrawableEnd}</code></td><td> Drawable to use as Loading Indicator in the Footer View.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableStart com.handmark.pulltorefresh.library:ptrDrawableStart}</code></td><td> Drawable to use as Loading Indicator in the Header View.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableTop com.handmark.pulltorefresh.library:ptrDrawableTop}</code></td><td></td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderBackground com.handmark.pulltorefresh.library:ptrHeaderBackground}</code></td><td> A drawable to use as the background of the Header and Footer Loading Views </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderSubTextColor com.handmark.pulltorefresh.library:ptrHeaderSubTextColor}</code></td><td> Text Color of the Header and Footer Loading Views Sub Header </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderTextAppearance com.handmark.pulltorefresh.library:ptrHeaderTextAppearance}</code></td><td> Base text color, typeface, size, and style for Header and Footer Loading Views </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderTextColor com.handmark.pulltorefresh.library:ptrHeaderTextColor}</code></td><td> Text Color of the Header and Footer Loading Views </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrListViewExtrasEnabled com.handmark.pulltorefresh.library:ptrListViewExtrasEnabled}</code></td><td>
        	Whether PullToRefreshListView has it's extras enabled.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrMode com.handmark.pulltorefresh.library:ptrMode}</code></td><td> Mode of Pull-to-Refresh that should be used </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrOverScroll com.handmark.pulltorefresh.library:ptrOverScroll}</code></td><td> Whether Android's built-in Over Scroll should be utilised for Pull-to-Refresh.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrRefreshableViewBackground com.handmark.pulltorefresh.library:ptrRefreshableViewBackground}</code></td><td> A drawable to use as the background of the Refreshable View </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrRotateDrawableWhilePulling com.handmark.pulltorefresh.library:ptrRotateDrawableWhilePulling}</code></td><td>
        	Whether the Drawable should be continually rotated as you pull.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrScrollingWhileRefreshingEnabled com.handmark.pulltorefresh.library:ptrScrollingWhileRefreshingEnabled}</code></td><td> Whether the user can scroll while the View is Refreshing </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrShowIndicator com.handmark.pulltorefresh.library:ptrShowIndicator}</code></td><td> Whether the Indicator overlay(s) should be used </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrSubHeaderTextAppearance com.handmark.pulltorefresh.library:ptrSubHeaderTextAppearance}</code></td><td> Base text color, typeface, size, and style for Header and Footer Loading Views Sub Header </td></tr>
           </table>
           @see #PullToRefresh_ptrAdapterViewBackground
           @see #PullToRefresh_ptrAnimationStyle
           @see #PullToRefresh_ptrDrawable
           @see #PullToRefresh_ptrDrawableBottom
           @see #PullToRefresh_ptrDrawableEnd
           @see #PullToRefresh_ptrDrawableStart
           @see #PullToRefresh_ptrDrawableTop
           @see #PullToRefresh_ptrHeaderBackground
           @see #PullToRefresh_ptrHeaderSubTextColor
           @see #PullToRefresh_ptrHeaderTextAppearance
           @see #PullToRefresh_ptrHeaderTextColor
           @see #PullToRefresh_ptrListViewExtrasEnabled
           @see #PullToRefresh_ptrMode
           @see #PullToRefresh_ptrOverScroll
           @see #PullToRefresh_ptrRefreshableViewBackground
           @see #PullToRefresh_ptrRotateDrawableWhilePulling
           @see #PullToRefresh_ptrScrollingWhileRefreshingEnabled
           @see #PullToRefresh_ptrShowIndicator
           @see #PullToRefresh_ptrSubHeaderTextAppearance
         */
        public static final int[] PullToRefresh = {
            0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003,
            0x7f010004, 0x7f010005, 0x7f010006, 0x7f010007,
            0x7f010008, 0x7f010009, 0x7f01000a, 0x7f01000b,
            0x7f01000c, 0x7f01000d, 0x7f01000e, 0x7f01000f,
            0x7f010010, 0x7f010011, 0x7f010012
        };
        /**
          <p>
          @attr description
           BELOW HERE ARE DEPRECEATED. DO NOT USE. 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrAdapterViewBackground
        */
        public static final int PullToRefresh_ptrAdapterViewBackground = 16;
        /**
          <p>
          @attr description
           Style of Animation should be used displayed when pulling. 


          <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>rotate</code></td><td>0x0</td><td></td></tr>
<tr><td><code>flip</code></td><td>0x1</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrAnimationStyle
        */
        public static final int PullToRefresh_ptrAnimationStyle = 12;
        /**
          <p>
          @attr description
           Drawable to use as Loading Indicator. Changes both Header and Footer. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrDrawable
        */
        public static final int PullToRefresh_ptrDrawable = 6;
        /**
          <p>This symbol is the offset where the {@link com.handmark.pulltorefresh.library.R.attr#ptrDrawableBottom}
          attribute's value can be found in the {@link #PullToRefresh} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.handmark.pulltorefresh.library:ptrDrawableBottom
        */
        public static final int PullToRefresh_ptrDrawableBottom = 18;
        /**
          <p>
          @attr description
           Drawable to use as Loading Indicator in the Footer View. Overrides value set in ptrDrawable. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrDrawableEnd
        */
        public static final int PullToRefresh_ptrDrawableEnd = 8;
        /**
          <p>
          @attr description
           Drawable to use as Loading Indicator in the Header View. Overrides value set in ptrDrawable. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrDrawableStart
        */
        public static final int PullToRefresh_ptrDrawableStart = 7;
        /**
          <p>This symbol is the offset where the {@link com.handmark.pulltorefresh.library.R.attr#ptrDrawableTop}
          attribute's value can be found in the {@link #PullToRefresh} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.handmark.pulltorefresh.library:ptrDrawableTop
        */
        public static final int PullToRefresh_ptrDrawableTop = 17;
        /**
          <p>
          @attr description
           A drawable to use as the background of the Header and Footer Loading Views 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrHeaderBackground
        */
        public static final int PullToRefresh_ptrHeaderBackground = 1;
        /**
          <p>
          @attr description
           Text Color of the Header and Footer Loading Views Sub Header 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrHeaderSubTextColor
        */
        public static final int PullToRefresh_ptrHeaderSubTextColor = 3;
        /**
          <p>
          @attr description
           Base text color, typeface, size, and style for Header and Footer Loading Views 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrHeaderTextAppearance
        */
        public static final int PullToRefresh_ptrHeaderTextAppearance = 10;
        /**
          <p>
          @attr description
           Text Color of the Header and Footer Loading Views 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrHeaderTextColor
        */
        public static final int PullToRefresh_ptrHeaderTextColor = 2;
        /**
          <p>
          @attr description
          
        	Whether PullToRefreshListView has it's extras enabled. This allows the user to be 
        	able to scroll while refreshing, and behaves better. It acheives this by adding
        	Header and/or Footer Views to the ListView.
        


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrListViewExtrasEnabled
        */
        public static final int PullToRefresh_ptrListViewExtrasEnabled = 14;
        /**
          <p>
          @attr description
           Mode of Pull-to-Refresh that should be used 


          <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>disabled</code></td><td>0x0</td><td></td></tr>
<tr><td><code>pullFromStart</code></td><td>0x1</td><td></td></tr>
<tr><td><code>pullFromEnd</code></td><td>0x2</td><td></td></tr>
<tr><td><code>both</code></td><td>0x3</td><td></td></tr>
<tr><td><code>manualOnly</code></td><td>0x4</td><td></td></tr>
<tr><td><code>pullDownFromTop</code></td><td>0x1</td><td> These last two are depreacted </td></tr>
<tr><td><code>pullUpFromBottom</code></td><td>0x2</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrMode
        */
        public static final int PullToRefresh_ptrMode = 4;
        /**
          <p>
          @attr description
           Whether Android's built-in Over Scroll should be utilised for Pull-to-Refresh. 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrOverScroll
        */
        public static final int PullToRefresh_ptrOverScroll = 9;
        /**
          <p>
          @attr description
           A drawable to use as the background of the Refreshable View 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrRefreshableViewBackground
        */
        public static final int PullToRefresh_ptrRefreshableViewBackground = 0;
        /**
          <p>
          @attr description
          
        	Whether the Drawable should be continually rotated as you pull. This only
        	takes effect when using the 'Rotate' Animation Style.
        


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrRotateDrawableWhilePulling
        */
        public static final int PullToRefresh_ptrRotateDrawableWhilePulling = 15;
        /**
          <p>
          @attr description
           Whether the user can scroll while the View is Refreshing 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrScrollingWhileRefreshingEnabled
        */
        public static final int PullToRefresh_ptrScrollingWhileRefreshingEnabled = 13;
        /**
          <p>
          @attr description
           Whether the Indicator overlay(s) should be used 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrShowIndicator
        */
        public static final int PullToRefresh_ptrShowIndicator = 5;
        /**
          <p>
          @attr description
           Base text color, typeface, size, and style for Header and Footer Loading Views Sub Header 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.handmark.pulltorefresh.library:ptrSubHeaderTextAppearance
        */
        public static final int PullToRefresh_ptrSubHeaderTextAppearance = 11;
    };
}
