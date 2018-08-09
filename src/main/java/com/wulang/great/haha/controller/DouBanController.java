package com.wulang.great.haha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DouBanController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value="/HelloWorld.vue",produces="text/plain")
    @ResponseBody
    public String HelloWorld(){
        return "// { \"framework\": \"Vue\" }\n" +
                "\n" +
                "/******/\n" +
                "(function(modules) { // webpackBootstrap\n" +
                "    /******/ // The module cache\n" +
                "    /******/\n" +
                "    var installedModules = {};\n" +
                "\n" +
                "    /******/ // The require function\n" +
                "    /******/\n" +
                "    function __webpack_require__(moduleId) {\n" +
                "\n" +
                "        /******/ // Check if module is in cache\n" +
                "        /******/\n" +
                "        if (installedModules[moduleId])\n" +
                "        /******/\n" +
                "            return installedModules[moduleId].exports;\n" +
                "\n" +
                "        /******/ // Create a new module (and put it into the cache)\n" +
                "        /******/\n" +
                "        var module = installedModules[moduleId] = {\n" +
                "            /******/\n" +
                "            exports: {},\n" +
                "            /******/\n" +
                "            id: moduleId,\n" +
                "            /******/\n" +
                "            loaded: false\n" +
                "                /******/\n" +
                "        };\n" +
                "\n" +
                "        /******/ // Execute the module function\n" +
                "        /******/\n" +
                "        modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);\n" +
                "\n" +
                "        /******/ // Flag the module as loaded\n" +
                "        /******/\n" +
                "        module.loaded = true;\n" +
                "\n" +
                "        /******/ // Return the exports of the module\n" +
                "        /******/\n" +
                "        return module.exports;\n" +
                "        /******/\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    /******/ // expose the modules object (__webpack_modules__)\n" +
                "    /******/\n" +
                "    __webpack_require__.m = modules;\n" +
                "\n" +
                "    /******/ // expose the module cache\n" +
                "    /******/\n" +
                "    __webpack_require__.c = installedModules;\n" +
                "\n" +
                "    /******/ // __webpack_public_path__\n" +
                "    /******/\n" +
                "    __webpack_require__.p = \"\";\n" +
                "\n" +
                "    /******/ // Load entry module and return exports\n" +
                "    /******/\n" +
                "    return __webpack_require__(0);\n" +
                "    /******/\n" +
                "})\n" +
                "/************************************************************************/\n" +
                "/******/\n" +
                "([\n" +
                "    /* 0 */\n" +
                "    /***/\n" +
                "    function(module, exports, __webpack_require__) {\n" +
                "\n" +
                "        'use strict';\n" +
                "\n" +
                "        var _a5e3760925ac3b9d68a3aa0cc = __webpack_require__(1);\n" +
                "\n" +
                "        var _a5e3760925ac3b9d68a3aa0cc2 = _interopRequireDefault(_a5e3760925ac3b9d68a3aa0cc);\n" +
                "\n" +
                "        function _interopRequireDefault(obj) {\n" +
                "            return obj && obj.__esModule ? obj : {\n" +
                "                default: obj\n" +
                "            };\n" +
                "        }\n" +
                "\n" +
                "        _a5e3760925ac3b9d68a3aa0cc2.default.el = '#root';\n" +
                "        new Vue(_a5e3760925ac3b9d68a3aa0cc2.default);\n" +
                "\n" +
                "        /***/\n" +
                "    },\n" +
                "    /* 1 */\n" +
                "    /***/\n" +
                "    function(module, exports, __webpack_require__) {\n" +
                "\n" +
                "        var __vue_exports__, __vue_options__\n" +
                "        var __vue_styles__ = []\n" +
                "\n" +
                "        /* template */\n" +
                "        var __vue_template__ = __webpack_require__(2)\n" +
                "        __vue_options__ = __vue_exports__ = __vue_exports__ || {}\n" +
                "        if (\n" +
                "            typeof __vue_exports__.default === \"object\" ||\n" +
                "            typeof __vue_exports__.default === \"function\"\n" +
                "        ) {\n" +
                "            if (Object.keys(__vue_exports__).some(function(key) {\n" +
                "                    return key !== \"default\" && key !== \"__esModule\"\n" +
                "                })) {\n" +
                "                console.error(\"named exports are not supported in *.vue files.\")\n" +
                "            }\n" +
                "            __vue_options__ = __vue_exports__ = __vue_exports__.default\n" +
                "        }\n" +
                "        if (typeof __vue_options__ === \"function\") {\n" +
                "            __vue_options__ = __vue_options__.options\n" +
                "        }\n" +
                "        __vue_options__.__file = \"/usr/src/app/raw/a5e3760925ac3b9d68a3aa0cc0298857.vue\"\n" +
                "        __vue_options__.render = __vue_template__.render\n" +
                "        __vue_options__.staticRenderFns = __vue_template__.staticRenderFns\n" +
                "        __vue_options__.style = __vue_options__.style || {}\n" +
                "        __vue_styles__.forEach(function(module) {\n" +
                "            for (var name in module) {\n" +
                "                __vue_options__.style[name] = module[name]\n" +
                "            }\n" +
                "        })\n" +
                "        if (typeof __register_static_styles__ === \"function\") {\n" +
                "            __register_static_styles__(__vue_options__._scopeId, __vue_styles__)\n" +
                "        }\n" +
                "\n" +
                "        module.exports = __vue_exports__\n" +
                "\n" +
                "\n" +
                "        /***/\n" +
                "    },\n" +
                "    /* 2 */\n" +
                "    /***/\n" +
                "    function(module, exports) {\n" +
                "\n" +
                "        module.exports = {\n" +
                "            render: function() {\n" +
                "                var _vm = this;\n" +
                "                var _h = _vm.$createElement;\n" +
                "                var _c = _vm._self._c || _h;\n" +
                "                return _c('text', {\n" +
                "                    staticStyle: {\n" +
                "                        fontSize: \"64px\"\n" +
                "                    }\n" +
                "                }, [_vm._v(\"Hello World!!!\")])\n" +
                "            },\n" +
                "            staticRenderFns: []\n" +
                "        }\n" +
                "        module.exports.render._withStripped = true\n" +
                "\n" +
                "        /***/\n" +
                "    }\n" +
                "    /******/\n" +
                "]);";
    }

    @RequestMapping(value="/hi",produces="text/plain")
    @ResponseBody
    public String hello(){
        return "hi";
    }
}

