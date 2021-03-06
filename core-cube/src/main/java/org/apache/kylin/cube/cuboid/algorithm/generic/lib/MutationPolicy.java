/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.apache.kylin.cube.cuboid.algorithm.generic.lib;

/**
 * Modified from the MutationPolicy.java in https://github.com/apache/commons-math
 *
 * Algorithm used to mutate a chromosome.
 *
 */
public interface MutationPolicy {

    /**
     * Mutate the given chromosome.
     * @param original the original chromosome.
     * @return the mutated chromosome.
     * @throws IllegalArgumentException if the given chromosome is not compatible with this {@link MutationPolicy}
     */
    Chromosome mutate(Chromosome original) throws IllegalArgumentException;
}
