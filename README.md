---
description: "FIXME: write description"
title: tutorial -- Marginalia
---

<table>
<colgroup>
<col style="width: 50%" />
<col style="width: 50%" />
</colgroup>
<tbody>
<tr class="odd">
<td class="docs"><div class="header">
<h1 id="tutorial" class="project-name"><a
href="http://example.com/FIXME">tutorial</a></h1>
<h2 id="snapshot" class="project-version">0.1.0-SNAPSHOT</h2>
<br />
&#10;<p>FIXME: write description</p>
</div>
<div class="dependencies">
<h3 id="dependencies">dependencies</h3>
<table>
<colgroup>
<col style="width: 33%" />
<col style="width: 33%" />
<col style="width: 33%" />
</colgroup>
<tbody>
<tr class="odd">
<td class="dep-name">org.clojure/clojure</td>
<td class="dotted"><hr /></td>
<td class="dep-version">1.11.1</td>
</tr>
</tbody>
</table>
</div></td>
<td class="codes"
style="text-align: center; vertical-align: middle; color: #666; padding-right: 20px;"><br />
<br />
<br />
(this space intentionally left almost blank)</td>
</tr>
<tr class="even">
<td class="docs"><div class="toc">
<span id="toc"></span>
<h3 id="namespaces">namespaces</h3>
<ul>
<li><a href="#petstore.clj">petstore.clj</a></li>
<li><a href="#tutorial.core">tutorial.core</a></li>
<li><a href="#tutorial.functions">tutorial.functions</a></li>
</ul>
</div></td>
<td class="codes" style="text-align: center;"> </td>
</tr>
<tr class="odd">
<td class="docs"><div class="docs-header">
<a href="#petstore.clj" id="petstore.clj" class="anchor"></a>
<h1 id="petstore.clj" class="project-name">petstore.clj</h1>
<a href="#toc" class="toc-link">toc</a>
</div></td>
<td class="codes" style="text-align: center;"></td>
</tr>
<tr class="even">
<td class="docs"></td>
<td class="codes" style="text-align: center;"><div class="sourceCode"
id="cb1"><pre class="sourceCode brush: clojure"><code class="sourceCode clojure"><span id="cb1-1"><a href="#cb1-1" aria-hidden="true" tabindex="-1"></a>(<span class="kw">require</span> &#39;[clojure.<span class="kw">repl</span> <span class="at">:refer</span> [<span class="kw">doc</span>]])</span></code></pre></div></td>
</tr>
<tr class="odd">
<td class="docs"><p>This is the petstore docstring</p></td>
<td class="codes" style="text-align: center;"><div class="sourceCode"
id="cb2"><pre class="sourceCode brush: clojure"><code class="sourceCode clojure"><span id="cb2-1"><a href="#cb2-1" aria-hidden="true" tabindex="-1"></a>(<span class="kw">ns</span> tutorial.petstore)</span></code></pre></div></td>
</tr>
<tr class="even">
<td class="docs"><p>This function returns the age of a pet in human
years.</p></td>
<td class="codes" style="text-align: center;"><div class="sourceCode"
id="cb3"><pre class="sourceCode brush: clojure"><code class="sourceCode clojure"><span id="cb3-1"><a href="#cb3-1" aria-hidden="true" tabindex="-1"></a>(<span class="bu">defn</span><span class="fu"> petToHumanAge</span></span>
<span id="cb3-2"><a href="#cb3-2" aria-hidden="true" tabindex="-1"></a>  [x]</span>
<span id="cb3-3"><a href="#cb3-3" aria-hidden="true" tabindex="-1"></a>  (<span class="bu">def</span><span class="fu"> petStore</span></span>
<span id="cb3-4"><a href="#cb3-4" aria-hidden="true" tabindex="-1"></a>    <span class="st">&quot;The petStore docstring&quot;</span></span>
<span id="cb3-5"><a href="#cb3-5" aria-hidden="true" tabindex="-1"></a>    {<span class="at">&#39;dog</span> <span class="dv">7</span>, <span class="at">&#39;cat</span> <span class="dv">5</span>, <span class="at">&#39;fish</span> <span class="dv">10</span>})</span>
<span id="cb3-6"><a href="#cb3-6" aria-hidden="true" tabindex="-1"></a>  (<span class="kw">get</span> petStore x))</span></code></pre></div></td>
</tr>
<tr class="odd">
<td class="docs"><p>A function that greets a person by name.</p></td>
<td class="codes" style="text-align: center;"><div class="sourceCode"
id="cb4"><pre class="sourceCode brush: clojure"><code class="sourceCode clojure"><span id="cb4-1"><a href="#cb4-1" aria-hidden="true" tabindex="-1"></a>(<span class="bu">defn</span><span class="fu"> greet</span></span>
<span id="cb4-2"><a href="#cb4-2" aria-hidden="true" tabindex="-1"></a>  [<span class="kw">name</span>]</span>
<span id="cb4-3"><a href="#cb4-3" aria-hidden="true" tabindex="-1"></a>  (<span class="kw">str</span> <span class="st">&quot;Hello, &quot;</span> <span class="kw">name</span>  <span class="st">&quot;!&quot;</span>))</span></code></pre></div></td>
</tr>
<tr class="even">
<td class="docs"></td>
<td class="codes" style="text-align: center;"><div class="sourceCode"
id="cb5"><pre class="sourceCode brush: clojure"><code class="sourceCode clojure"><span id="cb5-1"><a href="#cb5-1" aria-hidden="true" tabindex="-1"></a>(<span class="kw">doc</span> greet)</span>
<span id="cb5-2"><a href="#cb5-2" aria-hidden="true" tabindex="-1"></a>(<span class="kw">doc</span> tutorial.petstore)</span>
<span id="cb5-3"><a href="#cb5-3" aria-hidden="true" tabindex="-1"></a>(<span class="kw">doc</span> petStore)</span>
<span id="cb5-4"><a href="#cb5-4" aria-hidden="true" tabindex="-1"></a>(<span class="kw">doc</span> petToHumanAge)</span></code></pre></div></td>
</tr>
<tr class="odd">
<td class="spacer docs"> </td>
<td class="codes" style="text-align: center;"></td>
</tr>
<tr class="even">
<td class="docs"><div class="docs-header">
<a href="#tutorial.core" id="tutorial.core" class="anchor"></a>
<h1 id="tutorial.core" class="project-name">tutorial.core</h1>
<a href="#toc" class="toc-link">toc</a>
</div></td>
<td class="codes" style="text-align: center;"></td>
</tr>
<tr class="odd">
<td class="docs"></td>
<td class="codes" style="text-align: center;"><div class="sourceCode"
id="cb6"><pre class="sourceCode brush: clojure"><code class="sourceCode clojure"><span id="cb6-1"><a href="#cb6-1" aria-hidden="true" tabindex="-1"></a>(<span class="kw">ns</span> tutorial.core</span>
<span id="cb6-2"><a href="#cb6-2" aria-hidden="true" tabindex="-1"></a>  (<span class="at">:gen-class</span>))</span></code></pre></div></td>
</tr>
<tr class="even">
<td class="docs"><p>I don't do a whole lot ... yet.</p></td>
<td class="codes" style="text-align: center;"><div class="sourceCode"
id="cb7"><pre class="sourceCode brush: clojure"><code class="sourceCode clojure"><span id="cb7-1"><a href="#cb7-1" aria-hidden="true" tabindex="-1"></a>(<span class="bu">defn</span><span class="fu"> -main</span></span>
<span id="cb7-2"><a href="#cb7-2" aria-hidden="true" tabindex="-1"></a>  [&amp; args]</span>
<span id="cb7-3"><a href="#cb7-3" aria-hidden="true" tabindex="-1"></a>  (<span class="kw">println</span> <span class="st">&quot;Hello, World!&quot;</span>))</span></code></pre></div></td>
</tr>
<tr class="odd">
<td class="spacer docs"> </td>
<td class="codes" style="text-align: center;"></td>
</tr>
<tr class="even">
<td class="docs"><div class="docs-header">
<a href="#tutorial.functions" id="tutorial.functions"
class="anchor"></a>
<h1 id="tutorial.functions" class="project-name">tutorial.functions</h1>
<a href="#toc" class="toc-link">toc</a>
</div></td>
<td class="codes" style="text-align: center;"></td>
</tr>
<tr class="odd">
<td class="docs"></td>
<td class="codes" style="text-align: center;"><div class="sourceCode"
id="cb8"><pre class="sourceCode brush: clojure"><code class="sourceCode clojure"><span id="cb8-1"><a href="#cb8-1" aria-hidden="true" tabindex="-1"></a>(<span class="kw">ns</span> tutorial.functions</span>
<span id="cb8-2"><a href="#cb8-2" aria-hidden="true" tabindex="-1"></a>  (<span class="at">:gen-class</span>))</span></code></pre></div></td>
</tr>
<tr class="even">
<td class="docs"><p>First function</p></td>
<td class="codes" style="text-align: center;"><div class="sourceCode"
id="cb9"><pre class="sourceCode brush: clojure"><code class="sourceCode clojure"><span id="cb9-1"><a href="#cb9-1" aria-hidden="true" tabindex="-1"></a>(<span class="bu">defn</span><span class="fu"> -main</span></span>
<span id="cb9-2"><a href="#cb9-2" aria-hidden="true" tabindex="-1"></a>  []</span>
<span id="cb9-3"><a href="#cb9-3" aria-hidden="true" tabindex="-1"></a>  (<span class="kw">println</span> <span class="st">&quot;My name is Jocke&quot;</span>)</span>
<span id="cb9-4"><a href="#cb9-4" aria-hidden="true" tabindex="-1"></a>  (<span class="kw">println</span> <span class="st">&quot;loving Clojure so far&quot;</span>)</span>
<span id="cb9-5"><a href="#cb9-5" aria-hidden="true" tabindex="-1"></a>  (<span class="kw">+</span> <span class="dv">2</span> <span class="dv">5</span>))</span></code></pre></div></td>
</tr>
<tr class="odd">
<td class="docs"></td>
<td class="codes" style="text-align: center;"><div class="sourceCode"
id="cb10"><pre class="sourceCode brush: clojure"><code class="sourceCode clojure"><span id="cb10-1"><a href="#cb10-1" aria-hidden="true" tabindex="-1"></a>#(<span class="kw">println</span> <span class="st">&quot;Hello,&quot;</span> <span class="va">%</span>)</span></code></pre></div></td>
</tr>
<tr class="even">
<td class="docs"><p>(def increment (fn [x] (+ x 1)))</p></td>
<td class="codes" style="text-align: center;"></td>
</tr>
<tr class="odd">
<td class="docs"><p>(defn increment_set [x] (map increment x))</p></td>
<td class="codes" style="text-align: center;"><div class="sourceCode"
id="cb11"><pre class="sourceCode brush: clojure"><code class="sourceCode clojure"><span id="cb11-1"><a href="#cb11-1" aria-hidden="true" tabindex="-1"></a>(<span class="bu">defn</span><span class="fu"> DataTypes </span>[]</span>
<span id="cb11-2"><a href="#cb11-2" aria-hidden="true" tabindex="-1"></a>  <span class="co">#_</span>{<span class="at">:clj-kondo/ignore</span> [<span class="at">:inline-def</span>]}</span>
<span id="cb11-3"><a href="#cb11-3" aria-hidden="true" tabindex="-1"></a>  (<span class="bu">def</span><span class="fu"> a </span><span class="dv">1</span>)</span>
<span id="cb11-4"><a href="#cb11-4" aria-hidden="true" tabindex="-1"></a>  <span class="co">#_</span>{<span class="at">:clj-kondo/ignore</span> [<span class="at">:inline-def</span>]}</span>
<span id="cb11-5"><a href="#cb11-5" aria-hidden="true" tabindex="-1"></a>  (<span class="bu">def</span><span class="fu"> b </span><span class="fl">1.25</span>)</span>
<span id="cb11-6"><a href="#cb11-6" aria-hidden="true" tabindex="-1"></a>  <span class="co">#_</span>{<span class="at">:clj-kondo/ignore</span> [<span class="at">:inline-def</span>]}</span>
<span id="cb11-7"><a href="#cb11-7" aria-hidden="true" tabindex="-1"></a>  (<span class="bu">def</span><span class="fu"> c </span><span class="fl">1.25e-12</span>)</span>
<span id="cb11-8"><a href="#cb11-8" aria-hidden="true" tabindex="-1"></a>  (<span class="bu">def</span><span class="fu"> d </span><span class="bn">0xfbfc</span>)</span>
<span id="cb11-9"><a href="#cb11-9" aria-hidden="true" tabindex="-1"></a>  (<span class="kw">println</span> a)</span>
<span id="cb11-10"><a href="#cb11-10" aria-hidden="true" tabindex="-1"></a>  (<span class="kw">println</span> b)</span>
<span id="cb11-11"><a href="#cb11-11" aria-hidden="true" tabindex="-1"></a>  (<span class="kw">println</span> c)</span>
<span id="cb11-12"><a href="#cb11-12" aria-hidden="true" tabindex="-1"></a>  (<span class="kw">println</span> d))</span>
<span id="cb11-13"><a href="#cb11-13" aria-hidden="true" tabindex="-1"></a>(DataTypes)</span></code></pre></div></td>
</tr>
<tr class="even">
<td class="spacer docs"> </td>
<td class="codes" style="text-align: center;"></td>
</tr>
</tbody>
</table>

<div class="footer">

Generated by
[Marginalia](https://github.com/gdeer81/marginalia).  Syntax
highlighting provided by Alex Gorbatchev's
[SyntaxHighlighter](http://alexgorbatchev.com/SyntaxHighlighter/)

<div id="floating-toc">

- <span id="floating-toc_petstore.clj">petstore.clj</span>
- <span id="floating-toc_tutorial.core">tutorial.core</span>
- <span id="floating-toc_tutorial.functions">tutorial.functions</span>

</div>

</div>
