/*
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
title      Nord API                                     +
project    nord-java                                    +
version    0.0.0                                        +
repository https://github.com/arcticicestudio/nord-java +
author     Arctic Ice Studio                            +
email      development@arcticicestudio.com              +
copyright  Copyright (C) 2016                           +
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/
package com.arcticicestudio.nord;

/**
 * Public API entry point of the <a href="https://github.com/arcticicestudio/nord-java">Nord - Java</a> project, which
 * implements the <a href="https://github.com/arcticicestudio/nord">Nord</a> color palette.
 *
 * <div>
 *   <table >
 *     <tbody>
 *       <tr>
 *         <th style="border:0;">Polar Night</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(46,52,64);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(59,66,82);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(67,76,94);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(76,86,106);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Snow Storm</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(216,222,233);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(229,233,240);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(236,239,244);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Frost</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(143,188,187);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(136,192,208);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(129,161,193);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(94,129,172);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Aurora</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(191,97,106);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(208,135,112);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(235,203,139);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(163,190,140);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(180,142,173);margin:0"></th>
 *       </tr>
 *     </tbody>
 *   </table>
 * </div>
 *
 * @author Arctic Ice Studio &lt;development@arcticicestudio.com&gt;
 * @version 0.0.0
 * @since 0.1.0
 */
public enum Nord {
  /**
   * The color {@code nord0} of the "Polar Night" component with an RGB value of {@code rgb(46, 52, 64)} and an HEX
   * value of {@code #2E3440}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(46,52,64);margin: 0"></div>
   */
  NORD0(46, 52, 64),

  /**
   * The color {@code nord1} of the "Polar Night" component with an RGB value of {@code rgb(59, 66, 82)} and an HEX
   * value of {@code #3B4252}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(59,66,82);margin: 0"></div>
   */
  NORD1(59, 66, 82),

  /**
   * The color {@code nord2} of the "Polar Night" component with an RGB value of {@code rgb(67, 76, 94)} and an HEX
   * value of {@code #434C5E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(67,76,94);margin: 0"></div>
   */
  NORD2(67, 76, 94),

  /**
   * The color {@code nord3} of the "Polar Night" component with an RGB value of {@code rgb(76, 86, 106)} and an HEX
   * value of {@code #4C566A}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(76,86,106);margin: 0"></div>
   */
  NORD3(76, 86, 106),

  /**
   * The color {@code nord4} of the "Snow Storm" component with an RGB value of {@code rgb(216, 222, 233)} and an HEX
   * value of {@code #D8DEE9}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(216,222,233);margin: 0"></div>
   */
  NORD4(216, 222, 233),

  /**
   * The color {@code nord5} of the "Snow Storm" component with an RGB value of {@code rgb(229, 233, 240)} and an HEX
   * value of {@code #E5E9F0}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(229,233,240);margin: 0"></div>
   */
  NORD5(229, 233, 240),

  /**
   * The color {@code nord6} of the "Snow Storm" component with an RGB value of {@code rgb(236, 239, 244)} and an HEX
   * value of {@code #ECEFF4}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(236,239,244);margin: 0"></div>
   */
  NORD6(236, 239, 244),

  /**
   * The color {@code nord7} of the "Frost" component with an RGB value of {@code rgb(143, 188, 187)} and an HEX
   * value of {@code #8FBCBB}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(143,188,187);margin: 0"></div>
   */
  NORD7(143, 188, 187),

  /**
   * The color {@code nord8} of the "Frost" component with an RGB value of {@code rgb(136, 192, 208)} and an HEX
   * value of {@code #88C0D0}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(136,192,208);margin: 0"></div>
   */
  NORD8(136, 192, 208),

  /**
   * The color {@code nord9} of the "Frost" component with an RGB value of {@code rgb(129, 161, 193)} and an HEX
   * value of {@code #81A1C1}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(129,161,193);margin: 0"></div>
   */
  NORD9(129, 161, 193),

  /**
   * The color {@code nord10} of the "Frost" component with an RGB value of {@code rgb(94, 129, 172)} and an HEX
   * value of {@code #5E81AC}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(94,129,172);margin: 0"></div>
   */
  NORD10(94, 129, 172),

  /**
   * The color {@code nord11} of the "Aurora" component with an RGB value of {@code rgb(191, 97, 106)} and an HEX
   * value of {@code #BF616A}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(191,97,106);margin: 0"></div>
   */
  NORD11(191, 97, 106),

  /**
   * The color {@code nord12} of the "Aurora" component with an RGB value of {@code rgb(208, 135, 112)} and an HEX
   * value of {@code #D08770}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(208,135,112);margin: 0"></div>
   */
  NORD12(208, 135, 112),

  /**
   * The color {@code nord13} of the "Aurora" component with an RGB value of {@code rgb(235, 203, 139)} and an HEX
   * value of {@code #EBCB8B}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(235,203,139);margin: 0"></div>
   */
  NORD13(235, 203, 139),

  /**
   * The color {@code nord14} of the "Aurora" component with an RGB value of {@code rgb(163, 190, 140)} and an HEX
   * value of {@code #A3BE8C}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(163,190,140);margin: 0"></div>
   */
  NORD14(163, 190, 140),

  /**
   * The color {@code nord15} of the "Aurora" component with an RGB value of {@code rgb(180, 142, 173)} and an HEX
   * value of {@code #B48EAD}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(180,142,173);margin: 0"></div>
   */
  NORD15(180, 142, 173);
}
